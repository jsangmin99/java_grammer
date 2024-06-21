package C05AnonymousLambda;

import java.sql.Struct;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        전통적인 방식의 데이터 접근 방식 : 메모리 주소 접근
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        함수형 프로그래밍 방식 : 데이터와 객체중심이 아닌, 입력에 따른 출력만 존재
//        java 에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 Stream API
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(a -> System.out.println(a));
        int[] arr2 = Arrays.stream(arr).map(a -> a * 10).toArray();

//        스트림의 생성
        String[] stArr = {"HTML", "CSS", "JavaScript", "Java", "Python"};
//        Stream<클래스명> : 제내릭 타입으로 Stream객체가 생성
        Stream<String> stStream = Arrays.stream(stArr);

        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
        Stream<String> stStream2 = stList.stream();

        int[] intArr = {10, 20, 30, 40, 50};
//        기본형 자료는 별도의 Stream 제공
        IntStream intStream = Arrays.stream(intArr);

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        Stream<Integer> myStream = myList.stream();
//        int 가 아니라 Integer 이기 때문에 IntStream 사용 불가 (기본형 자료형만 사용 가능)
//        IntStream intStream2 = myList.stream();


//        stream 변환(중개연산) : filter, map, sorted, distinct, limit, skip, peek
        String[] stArr2 = {"HTML", "CSS", "JavaScript", "Java", "Python"};

//        filter : 특정 기준으로 대상을 filtering
//        참조변수 스트림변환의 경우 제네릭의 타입소거 문제 발생
//        제내릭의 타입소거란 제네릭타입을 런타임 시점에는 제거하는것을 의미
//        그래서 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
        String[] newStArr = Arrays.stream(stArr2).filter(a -> a.length() <= 4).toArray(a -> new String[a]); //a 변수에는 stArr2의 요소의 개수가 들어감
//        메서드 참조 방식(매개변수가 추론가능할때 생략하는 형식) : 클래스 :: 메서드 (a-> new String[a] = String[]::new)
        String[] newStArr2 = Arrays.stream(stArr2).filter(a -> a.length() <= 4).toArray(String[]::new);

        int[] intArr2 = {10, 10, 30, 40, 50};
        int[] newIntArr = Arrays.stream(intArr2).filter(a -> a <= 30).toArray();
        System.out.println(Arrays.toString(newIntArr));
        int[] newIntArr2 = Arrays.stream(intArr2).distinct().toArray();
        System.out.println(Arrays.toString(newIntArr2));
        int total = Arrays.stream(intArr2).sum();
        System.out.println(total);

        //        map : 기존의 스트림을 조작하여 새로운 스트림을 생성
        int[] newMapArr = Arrays.stream(intArr2).map(a -> a * 10).toArray();
        System.out.println(Arrays.toString(newMapArr));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        홀수 찾기
        int[] newArr2 = Arrays.stream(arr3).filter(a -> a % 2 == 1).toArray();
        System.out.println(Arrays.toString(newArr2));
//        홀수만 담은 배열의 값을 제곱한 새로운 배열 생성
        int[] newMapArr2 = Arrays.stream(arr3).filter(a -> a % 2 == 1).map(a -> a * a).toArray();
        System.out.println("filter + map" + Arrays.toString(newMapArr2));

//        홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성 : filter, map, sorted
        int[] sortedNewMapArr = Arrays.stream(arr3).filter(a -> a % 2 == 1).map(a -> a * a).sorted().toArray();
        System.out.println("filter + map + sorted" + Arrays.toString(sortedNewMapArr));

//        mapToInt : intStream으로 변환 해주는 map
        String[] strArr = {"HTML", "CSS", "JavaScript", "Java", "Python"};
        int[] strArrLength = Arrays.stream(strArr).mapToInt(a -> a.length()).toArray();
        System.out.println("MapToInt ; " + Arrays.toString(strArrLength));
        int[] strArrLength2 = Arrays.stream(strArr).mapToInt(String::length).limit(3).toArray();
        System.out.println("MapToInt ; " + Arrays.toString(strArrLength2));


//        스트림의 소모 -> sum : 힙계, reduce : 누적계산, foreach : 출력 등
        int[] intArr3 = {10, 20, 30, 40, 50};
        Arrays.stream(intArr3).forEach(a -> System.out.println(a));

        int intArrSum = Arrays.stream(intArr3).sum();
//      optional : 값이 있을수도 있고 없을 수도 있음을 명시한 객체
        int intArrMax = Arrays.stream(intArr3).max().getAsInt();
        int intArrMin = Arrays.stream(intArr3).min().getAsInt();
        int intArrCount = (int) Arrays.stream(intArr3).count();
//        reduce(초기값, 연산식);
        int allMultiply = Arrays.stream(intArr3).reduce(1, (a, b) -> a * b);
        int allAdd = Arrays.stream(intArr3).reduce(0, (a, b) -> a + b);

        System.out.println(allMultiply);
        System.out.println(allAdd);

//        findFirst : 첫번쨰 요소 반환
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 20));
        students.add(new Student("김철수", 32));
        students.add(new Student("김영희", 35));
        students.add(new Student("이영수", 22));

//        나이가 30 넙는 학생중에 첫번째 index값을 가지는 학생 객체 생성
        Student student = students.stream()
                .filter(a -> a.getAge() >= 30)
                .findFirst()
                .get();
        System.out.println(student.getName());

//        student 객체 실습
//        1) 모든 객체의 평균 나이
//        2) 가장 나이 어린 사람 찾기
//        3) 30대의 이름을 String 배열에 담기
        Student avgStudent = students.stream().reduce(new Student("", 0), (a, b) -> new Student("", a.getAge() + b.getAge()));
        int avgStudent2 = (int) students.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
        System.out.println("학생들의 평균나이 " + avgStudent.getAge() / students.size());
        System.out.println("학생들의 평균나이 " + avgStudent2);

        Student minStudent = students.stream().reduce(new Student("", 100), (a, b) -> a.getAge() < b.getAge() ? a : b);
        Student minStudent2 = students.stream().sorted((a, b) -> a.getAge() - b.getAge()).findFirst().get();
        System.out.println("학생들중 나이가 가장 적은사람 " + minStudent.getName() + " " + minStudent.getAge());
        System.out.println("학생들중 나이가 가장 적은사람 " + minStudent2.getName() + " " + minStudent2.getAge());

        String[] ageList = students.stream().filter(a -> a.getAge() >= 30 && a.getAge() < 40).map(a -> a.getName()).toArray(String[]::new);
        System.out.println(Arrays.toString(ageList));
        System.out.println("30대 학생들의 이름 : " + Arrays.toString(ageList));


//        Optional 객체 : 특정객체에 값이 있을수도 없을수도 있음을 명시한 객체
//        ofNullable : null이 있을수도 있는 경우에 Optional 객체 생성하는메서드
        Optional<String> opt1 = Optional.ofNullable(null);
        String str1 = null;

        if (opt1.isPresent()) {
            str1 = opt1.get();
        } else {
            str1 = "값이 없습니다.";
        }
        System.out.println(str1);

//        Optional 객체 생성 3가지 방법
        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.of("hello"); // null 못들어감
        Optional<String> optional3 = Optional.ofNullable(null); // null이 들어갈수 있음

        System.out.println("=================optional 처리=================");
//        Optional 객체 처리방법 4가지
//        방법1. isParsent() : 값이 있는지 없는지 확인후 get()
        System.out.println("isPresent() : " + optional2.isPresent());
        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        } else {
            System.out.println("값이 없습니다.");
        }

//        방법2. orElse() : 값이 있으면 있는값 return, 값이 없을때 대체값을 지정
        System.out.println("orElse() : " + optional3.orElse("값이 없습니다."));
        String str2 = optional3.orElse("값이 없습니다.");
        System.out.println(str2);
//        방법3. orElseGet() : 값이 있으면 있는값 return, 값이 없을때 대체값을 람다식으로 지정
        System.out.println("orElseGet() : " + optional3.orElseGet(() -> new String("값이 없습니다.")));
        String str3 = optional3.orElseGet(() -> new String("값이 없습니다."));

//        방법4. orElseThrow() : 가장 중요. 값이 있으면 있는값 return, 없으면 지정된 예외 강제 발생
//        개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재
//        System.out.println(optional3.orElseThrow(() -> new IllegalArgumentException("값이 없습니다.")));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("홍길동", 20));
        students2.add(new Student("김철수", 21));
        students2.add(new Student("김영희", 22));
        students2.add(new Student("이영수", 23));

        OptionalDouble answer1 = students2.stream()
                .filter(a -> a.getAge() >= 30)
                .mapToInt(a -> a.getAge())
                .average();
        if (answer1.isPresent()) {
            System.out.println(answer1.getAsDouble());
        } else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer1);


        double answer2 = students2.stream()
                .filter(a -> a.getAge() >= 30)
                .mapToInt(a -> a.getAge())
                .average()
                .orElseThrow(()->new NoSuchElementException("값이 없습니다."));
        System.out.println(answer2);


    }
}