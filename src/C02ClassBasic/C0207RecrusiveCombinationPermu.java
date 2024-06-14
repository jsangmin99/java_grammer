package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecrusiveCombinationPermu {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        myList로 만들수 있는 2개 짜리 숫자조합을 이중리스트에 담기
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(list.get(i));
                temp.add(list.get(j));
                result.add(temp);
            }
        }
        System.out.println(result);

//        myList로 만들수 있는 2개 짜리 숫자조합을 이중리스트에 담기 - 재귀
        List<List<Integer>> result2 = new ArrayList<>();
        combinations(result2, list, new ArrayList<>(), 0, 3);
        System.out.println("a");
        System.out.println(result2);

        count2 = 4;
        combinations2(new ArrayList<>(), 0);
        System.out.println(result3);


//        순열
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> result4 = new ArrayList<>();
        System.out.println(result4);

        int N = 2;
        for (int i = 0; i < myList.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(myList.get(i));
            for (int j = 0; j < myList.size(); j++) {
                if (i == j) {
                    continue;
                }
                temp.add(myList.get(j));
                result4.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
            }
        }
        System.out.println("per : " + result4);


//        재귀방식 boolean 사용
        List<List<Integer>> result6 = new ArrayList<>();
        boolean[] visited = new boolean[myList.size()];
        permutations2(result6, myList, new ArrayList<>(), visited);
        System.out.println(result6);
    }

    private static void permutations2(List<List<Integer>> result6, List<Integer> myList, ArrayList<Integer> temp, boolean[] visited) {
        if(temp.size() == myList.size()){
            result6.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            temp.add(myList.get(i));
            permutations2(result6, myList, temp, visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }




    static void combinations(List<List<Integer>> result, List<Integer> mylist, List<Integer> temp, int start, int count){
        if(count == temp.size()){
            //temp 값을 그대로 add할경우 temp가 바뀌면 result에 있는 값도 바뀌기 때문에 새로운 객체를 만들어서 add해야함
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < mylist.size(); i++) {
            temp.add(mylist.get(i));
            combinations(result, mylist, temp, i+1, count);
            temp.remove(temp.size()-1);
        }
    }

    //    또 다른 재귀 풀이
    static int count2 = 0;
    static List<List<Integer>> result3 = new ArrayList<>();
    static List<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    static void combinations2(List<Integer> temp, int start) {
        if (temp.size() == count2) {
            result3.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList2.size(); i++) {
            temp.add(myList2.get(i));
            combinations2(temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }



}
