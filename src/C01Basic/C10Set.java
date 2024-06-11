package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("h");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);
//
////        폰켓몬
//        int[] nums = {3, 1, 2, 3};
//        Set<String> mySet2 = new HashSet<>();
//        for (int num : nums) {
//            mySet2.add(String.valueOf(num));
//        }
//        int answer = Math.min(mySet2.size(), nums.length / 2);


////    list를 인자 값으로 받아서 초기값으로 세팅 가능
//        Set<String> mySet = new HashSet<>();
//        System.out.println(mySet);
//
//        String[] arr = {"baseball", "soccer", "basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        System.out.println(mySet2);
//        mySet2.remove("baseball");
//        System.out.println(mySet2);

//        전화번호 목록
        /*
        phone_book	return
["119", "97674223", "1195524421"]	false
["123","456","789"]	true
["12","123","1235","567","88"]
         */



//        String[] phone_book = {"123","456","789"};
//        boolean answer = true;
//        Arrays.sort(phone_book);
//        for (int i = 1; i < phone_book.length; i++) {
//            if(phone_book[i].contains(phone_book[i-1])){
//                if(phone_book[i].substring(0,phone_book[i-1].length()).equals(phone_book[i-1])) return false;
//            }
//        }
//        System.out.println(answer);
//
//        Set<String> mySet3 = new HashSet<>(Arrays.asList(phone_book));
//        boolean answer  = true;
//        for (String phone : phone_book){
//            for(int i = 1; i < phone.length(); i++){
//                System.out.println(phone.substring(0, i));
//                System.out.println(mySet3 + "=");
//
//                if(mySet3.contains(phone.substring(0, i))){
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(answer);

//        집합 관련 함수 : 교집합 : retainAll, 합집합 : addAll, 차집합 : removeAll
        Set<String> set1 = new HashSet<>(Arrays.asList("java", "python", "c++"));
        Set<String> set2 = new HashSet<>(Arrays.asList("java", "c++", "c#"));

////        retainAll : 교집합
//        set1.retainAll(set2);
//        System.out.println(set1); // [java, c++]
////        addAll : 합집합
//        set1.addAll(set2);
//        System.out.println(set1); // [java, c++, c#]
////         removeAll : 차집합
//        set1.removeAll(set2);
//        System.out.println(set1); // [python]



//        linkedHashSet, TreeSet
        Set<String> mySet4 = new LinkedHashSet<>();
        mySet4.add("java");
        mySet4.add("python");
        mySet4.add("c++");
        System.out.println(mySet4);

        Set<String> mySet5 = new TreeSet<>();
        mySet5.add("java");
        mySet5.add("python");
        mySet5.add("c++");
        System.out.println(mySet5);

//        두개 뽑아서 더하기
        int [] numbers = {2,1,3,4,1};
        Set<Integer> answerSet = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                answerSet.add(numbers[i] + numbers[j]);
            }
        }
        int result[] = new int[answerSet.size()];
        int index = 0;
        for (int num : answerSet) {
            result[index++] = num;
        }

        System.out.println(answerSet);






    }
}
