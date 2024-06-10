package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
////        List 선언 방법
//        ArrayList<String> myList = new ArrayList<>();
//
////        가장 일반적인 List 선언 방법
////        왼쪽엔 인터페이스, 오른쪽엔 구현체(클래스)
//        List<String> myList2 = new ArrayList<>();
//        Queue<String> myQueue = new LinkedList<>();
//
////        초기값 생성 방법1
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("c++");
//
////        초기값 생성방법 2 리스트를 주입하는 방식
////        Arrays.asList는 배열을 리스트로 반환하는 메서드
//        String[] myArray = {"java", "python", "c++"};
//        List<String> myList3 = new ArrayList<>(Arrays.asList(myArray));
//        List<String> myList4 = new ArrayList<>(List.of(myArray));
//
//        int[] intArr = {1, 2, 3, 4, 5};
//        List<Integer> myList4 = new ArrayList<>();
//        for (int i : intArr) {
//            myList4.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        System.out.println(myList);
//
////        add(index, value) : 중간에 값삽입 (중간에 값 삽입하는것은 성능이 몹시 떨어진다.)
//        myList.add(0, 3);
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//
////        특정리스트의 요소를 모두 add
//        myList2.add(myList);
//        System.out.println("특정리스트의 요소를 모두 add");
//        System.out.println(myList2);
//
////        get : 특정 위치의 요소를 반환
//        System.out.println("get : 특정 위치의 요소를 반환");
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 list출력
////        size(): 리스트의 길이(개수)반환
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
////        remove : 요소삭제
////        1)index를 통한 삭세 2) value를 통한 삭제
//        System.out.println(myList);
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(2));
//        System.out.println(myList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);

////        set(index,value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
////        indexOf: 특정값이 몇번째 index에 위치한지 return
////        가장 먼저 나오는 값의 index return
//        System.out.println(myList.indexOf(100));

//        전체 삭제 : clear()
//        isEmpty() : 리스트가 비어있는지 확인

//        List<Integer> list = new ArrayList<>();
//        System.out.println(list.isEmpty()); //true
//        list.add(10);
//        System.out.println(list.isEmpty()); //false
//        System.out.println(list.contains(20)); //false

////        이중리스트(리스트안에 리스트
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(10);
//        System.out.println(myList.get(0).get(0));
//
//
////        리스트안에 배열 : 배열사이즈 2,3,4개짜리 배열 3개 들어가는 것으로 add
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add (new int[]{1, 2});
//        myList2.add(new int[]{10, 20, 30});
//        myList2.add(new int[]{100, 200, 300, 400});
//        System.out.println(Arrays.deepToString(myList2.toArray()));

////        리스트 정렬 : Collections.sort(), 리스트객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
////        정렬1 . Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        정렬2. 리스트객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
////        프로그래머스 : n의 배수 고르기
////        numlist = [4, 5, 6, 7, 8, 9, 10, 11, 12]
////        n = 3
//        List<Integer> numList = new ArrayList<>();
//        int[] result = {};
//        List<Integer> resultList = new ArrayList<>();
//        for (int i = 4; i <= 12; i++) {
//            numList.add(i);
//        }
//        int n = 3;
//        for(int i = 0 ; i < numList.size(); i++) {
//            if (numList.get(i) % n == 0) {
//                resultList.add(numList.get(i));
//            }
//        }
//        int[] answer = new int[resultList.size()];
//        for(int i = 0; i < resultList.size(); i++) {
//            answer[i] = resultList.get(i);
//        }

////        list 활용해서 두개 뽑아서 더하기 (contains 활용)
//        int [] numbers = {2, 1, 3, 4, 1};
//        List<Integer> answerList = new ArrayList<>();
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (!answerList.contains(numbers[i] + numbers[j])) {
//                    answerList.add(numbers[i] + numbers[j]);
//                }
//            }
//        }
//        answerList.sort(Comparator.naturalOrder());
//        int answer[] = new int[answerList.size()];
//        for (int i = 0; i < answerList.size(); i++) {
//            answer[i] = answerList.get(i);
//        }
//        System.out.println(answerList);


//        배열과 List 간의 변환
//        1.String 배열을 List<String> 로 변환
        String [] strArr = {"java", "python", "c++"};

//        1-1. Arrays.asList() 사용
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        System.out.println(strList);

//        1-2. for문 사용
        List<String> strList2 = new ArrayList<>();
        for (String s : strArr) {
            strList2.add(s);
        }
        System.out.println(strList2);

//        1-3. Stream 사용
        List<String> strList3 = Arrays.stream(strArr).collect(Collectors.toList());
        System.out.println(strList3);

//        2. List<String>을 String[]로 변환
//        2-1. for문 사용
//        2-2. toArray() 사용
        String[] strArr2 = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(strArr2));

//        3. int[]를 List<Integer>로 변환
//        3-1 for문사용
//        3-2 StreamApi 사용
        int[] intArr = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

   }
}
