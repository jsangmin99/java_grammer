package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("soccer"));
//        myMap.put("baseball", "크리켓");
//        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");
//        System.out.println(myMap);
////        ㅔputIfAbsent() : key가 존재하지 않을 때만 값을 추가
//        myMap.putIfAbsent("basketball", "배구");
//        System.out.println(myMap);
////        getOrDefault() : key가 존재하지 않을 때 기본값을 반환
//        System.out.println(myMap.getOrDefault("baseball", "비어있음")); //비어있음
//        System.out.println(myMap.containsKey("baseball")); //false

        String[] arr = {"농구", "농구", "배구", "야구", "배구"};
//        농구 :2 배구 :2. 야구:1
        Map<String, Integer> myMap2 = new HashMap<>();
        for (String s : arr) {
            myMap2.put(s, myMap2.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (myMap2.containsKey(s)) {
                myMap2.put(s, myMap2.get(s) + 1);
            } else {
                myMap2.put(s, 1);
            }
        }
//        System.out.println(myMap2);

//        enhanced for문
        for (String s : myMap2.keySet()) {
            System.out.println(s);
            System.out.println(myMap2.get(s));
        }
        for (Integer i : myMap2.values()) {
            System.out.println(i);
        }

//        iterator를 통해 key값 하나씩 출력
        Iterator<String> myIter = myMap2.keySet().iterator();
//        next() 메서드느 데이터 하나씩 소모시키면서 return
//        System.out.println(myIter.next());
//        hashNext() : Iterator가 가리키는 데이터가 있는지 확인
        System.out.println("iterator를 통해 key값 하나씩 출력");
        while (myIter.hasNext()) {
            String key = myIter.next();
            System.out.println(key);
            System.out.println(myMap2.get(key));
        }



////        프로그래머스 완주하지 못한 선수
////        participant	            completion	        return
////        ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
//
//        String [] participant = {"leo", "kiki", "eden"};
//        String [] completion = {"eden", "kiki"};
//
//        Map<String, Integer> remainMap = new HashMap<>();
//        for (String s : participant) {
//            remainMap.put(s, remainMap.getOrDefault(s, 0) + 1);
//        }
//        for (String s : completion) {
//            remainMap.put(s, remainMap.get(s) - 1);
//        }
//        String answer = "";
//        for (String s : remainMap.keySet()) {
//            if (remainMap.get(s) != 0) {
//                answer = s;
//            }
//        }
//        System.out.println(answer);


//        프로그래머스 의상
//clothes	return
//[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]	5
//[["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]	3
//        String [][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String, Integer> clothesMap = new HashMap<>();
//        for (String[] s : clothes) {
//            clothesMap.put(s[1], clothesMap.getOrDefault(s[1], 0) + 1);
//        }
//        int answer = 1;
//        // nC1 * mC1 * ... * zC1 - 1
//        for (String s : clothesMap.keySet()) {
//            answer *= clothesMap.get(s) + 1;
//        }
//
//        System.out.println(answer - 1);

////        LinkedHashMap : 데이터 삽입 순서 유지
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("hello5", 1);
//        linkedHashMap.put("hello4", 1);
//        linkedHashMap.put("hello3", 1);
//        linkedHashMap.put("hello2", 1);
//        linkedHashMap.put("hello1", 1);
//        System.out.println(linkedHashMap);
//
//
////        TreeMap : key값을 기준으로 정렬
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 1);
//        treeMap.put("hello3", 1);
//        treeMap.put("hello2", 1);
//        treeMap.put("hello1", 1);
//        System.out.println(treeMap);
//
////        프로그래머스 문자열 내 마음대로 정렬하기
//        String [] strings = {"abce", "abcd", "cdx"};
//
//        int n = 2;
//        Map<String, String> treeMap2 = new TreeMap<>();
//        for(String s : strings){
//            treeMap2.put(s.substring(n, n+1) + s, s);
//        }
//        String [] answer = new String[strings.length];
//        answer = treeMap2.values().toArray(answer);
//        System.out.println(Arrays.toString(answer));
//
//        // 리스트를 이용한 풀이
//        System.out.println("리스트를 이용한 풀이");
//        List<String> list = new ArrayList<>();
//        String [] answer = new String[strings.length];
//        Collections.addAll(list, strings);
//
//        List<String> sortingList = new ArrayList<>();
//        for (String s : strings) {
//            sortingList.add(s.charAt(n) + s);
//        }
//
//        for(int i = 0; i < strings.length; i++){
//            sortingList.set(i, list.get(i).charAt(n) + list.get(i));
//        }
//        Collections.sort(sortingList);
//        for(int i = 0; i < strings.length; i++){
//            answer[i] = sortingList.get(i).substring(1);
//        }
//        answer = Arrays.copyOf(answer, answer.length);
//        System.out.println(Arrays.toString(answer));






    }
}
