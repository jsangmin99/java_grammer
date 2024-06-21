package C05AnonymousLambda;


import org.w3c.dom.ls.LSOutput;

import java.io.StringReader;
import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
        //        자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
        //        Comparable 인터페이스에는 compareTo 메서드
        //        Comparator 인터페이스에는 compare 메서드 선언

        //        String 클래스에 compareTo 내장(Comparable 구현)
        //        String 클래스 외에 java 많은 내장 클래스에서 Comparable 구현
        //        String a = "hello";
        //        String b = "horld";
        //
        ////        두 문자열의 각 자리를 순차적으로 비교
        ////        문자열의 비교는 유니코드값의 차이를 반환
        //        System.out.println(a.compareTo(b));
        //
        ////        Integer a1 = 10;
        ////        Integer a2 = 10;
        ////        System.out.println(a1.compareTo(a2));
        //
        //        List<String> myList = new ArrayList<>();
        //        myList.add("java");
        //        myList.add("python");
        //        myList.add("javascript");
        //        Collections.sort(myList);   // Comparable의 compareTo 메서드를 구현하여 정렬
        //        System.out.println(myList);
        //        Collections.sort(myList, Comparator.reverseOrder());
        //        System.out.println(myList);
        //        myList.sort(Comparator.naturalOrder());
        //        myList.sort(Comparator.reverseOrder());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 19));
        students.add(new Student("lee", 29));
        students.add(new Student("aprk", 15));
        students.add(new Student("sksi", 30));
        students.add(new Student("kim", 25));

        System.out.println(students);
////                방법1. Student객체에서 Comparable을 구현 => compareTo 메서드를 오버라이딩
//                Collections.sort(students);
//        for (Student student : students) {
//            System.out.println(student.getName() + student.getAge());
//            //            System.out.println(students.get(i).getAge());;
//        }

//                방법2. Comparator를 구현한 익명객체를 sort에 주입
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //                return o1.getAge()-o2.getAge();
                return o1.getName().compareTo(o2.getName());
            }
        };
        //        students.sort(myComparator);
        //        for(Student s : students){
        //            System.out.println(s.getName()+ s.getAge());;
        //        }
        //        students.sort((a,b)->a.getName().compareTo(b.getName()));
        //        for(Student s : students){
        //            System.out.println(s.getName()+ s.getAge());;
        //        }

        //        아래 문자열을 글자길이 순서로 내림차순 정렬
        String arr[] = {"hello", "java", "c++", "world2"};
        Arrays.sort(arr, Comparator.reverseOrder());

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.toString(arr));

////                [4,5], [1,2], [5,0], [3,1] 내림차순
//                List<int[]> myList = new ArrayList<>();
//                myList.add(new int[]{4, 5});
//                myList.add(new int[]{1, 2});
//                myList.add(new int[]{5, 0});
//                myList.add(new int[]{3, 1});
//                myList.sort((a,b) ->b[1]-a[1]);
//
//                for(int[]a : myList){
//                    System.out.println(Arrays.toString(a));
//                };

        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4, 5});
        myList.add(new int[]{1, 2});
        myList.add(new int[]{5, 0});
        myList.add(new int[]{3, 1});

////                방법 1.
//        Comparator<int[]> myComparator2 = new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[1] == o2[1]) {
//                    return o1[0] - o2[0];
//                } else {
//                    return o2[1] - o1[1];
//                }
//            }
//        };

//        방법 2.
        Comparator<int[]> myComparator2 = (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else
                return b[1] - a[1];
        };
        myList.sort(myComparator2);

//                myList.sort((a,b) -> { // 1번째 인덱스로 내림차순 정렬
//                    if(a[1] == b[1]){ // 1번째 인덱스가 같으면
//                        return a[0]-b[0]; // 0번째 인덱스로 비교
//                    }else
//                        return b[1]-a[1]; // 1번째 인덱스로 비교
//                });
        for (int[] a : myList) {
            System.out.println(Arrays.toString(a));
        };


        String[] strArr = {"hello", "java", "c++", "world2"};
        Queue<String> pq = new PriorityQueue<>();
        for (String s : strArr) {
            pq.add(s);
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

System.out.println("=========글자 길이 내림차순 PQ===============");

//        글자 길이 내림차순 PQ
        Queue<String> pq2 = new PriorityQueue<>(((o1, o2) -> o2.length() - o1.length()));

        for (String s : strArr) {
            pq2.add(s);
        }
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
        //    프로그래머스 가장 큰수
//        시간 초과
        int[] numbers = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                String a = String.valueOf(numbers[i]);
                String b = String.valueOf(numbers[j]);
                if((a+b).compareTo(b+a) < 0){ // a+b가 b+a보다 작으면
                    int temp = numbers[i]; // swap
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        String answer = "";
        for (int number : numbers) {
            answer += number;
        }
        System.out.println(answer);

//        다른 방식
        int numbers3[] = {3, 30, 34, 5, 9};

        List<String> list = new ArrayList<>();
        for (int number : numbers3) {
            list.add(String.valueOf(number));
        }
        list.sort((a,b) -> (b+a).compareTo(a+b)); // b+a가 a+b보다 크면 b+a가 더 앞으로 감 => 내림차순 정렬 완성
        StringBuilder answer2 = new StringBuilder();
        for (String s : list) {
            answer2.append(s);
        }
        if(answer2.charAt(0) == '0'){
            answer2 = new StringBuilder("0");
        }

        System.out.println(answer2);

//        priority queue 방식
        Queue<String> pq3 = new PriorityQueue<>((a,b) -> (b+a).compareTo(a+b));
        for (int number : numbers3) {
            pq3.add(String.valueOf(number));
        }
        StringBuilder answer3 = new StringBuilder();
        while (!pq3.isEmpty()){
            answer3.append(pq3.poll());
        }
        if(answer3.charAt(0) == '0'){
            answer3 = new StringBuilder("0");
        }
        System.out.println(answer3);


//        쓰레드 구현방법 : 쓰레드 상속, Runnable 인터페이스
//        Runnable 인터페이스 주입을 통한 쓰레드 구현
//        Runnable 인터페이스 : 쓰레드 구현
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 생성한 쓰레드1 입니다.1");
                System.out.println("새로 생성한 쓰레드1 입니다.2");
                System.out.println("새로 생성한 쓰레드1 입니다.3");
                System.out.println("새로 생성한 쓰레드1 입니다.4");
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> System.out.println("새로 생성한 쓰레드2 입니다."));
        t2.start();
        new Thread(() -> System.out.println("새로 생성한 쓰레드3 입니다.")).start();

        System.out.println("main 쓰레드 입니다.");
    }

}



//class Student implements Comparable<Student>
class Student2 {
    String name;
    int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //    모든 클래스의 조상클래스인 Object클래스이 toString 메서드를 Overriding하여
    //    객체 호출시에 자동으로 toString 메서드 호출
    @Override
    public String toString() {
        return "이름 :" + this.name + ", 나이 : " + this.age;
    }

    //    @Override
    //    public int compareTo(Student s) {
    //        return this.age - s.getAge();
    //    }
    ////    public int compareTo(Student s) {
    ////        return this.name.compareTo(s.getName());
    ////    }



}

