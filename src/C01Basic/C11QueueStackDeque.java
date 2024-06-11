package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import static java.util.Collections.sort;

public class C11QueueStackDeque {
    public static void main(String[] args) {

//        Queue<Integer> myQueue = new LinkedList<>();
//        myQueue.add(10);
//        myQueue.add(20);
//        myQueue.add(30);
//        System.out.println(myQueue); // [10, 20, 30]
//        System.out.println(myQueue.poll()); // 10
//        System.out.println(myQueue); // [20, 30]
//        System.out.println(myQueue.peek()); // 20
//        System.out.println(myQueue); // [20, 30]

//
////      LinkkedList와 ArrayList 비교
////        LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.add(0,10);
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList의 중간 삽입 : " + (endTime - startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0,10);
//        }
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime2 - startTime2));
//
//
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.get(i);
//        }
//
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LinkedList의 중간 삽입 : " + (endTime3 - startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.get(i);
//        }
//
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime4 - startTime4));
//
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//        }


//        ArrayBlockingQueue : 길이제한 큐
        Queue<String> blockQue = new ArrayBlockingQueue<>(3);
        blockQue.add("1");
        blockQue.add("2");
        blockQue.add("3");
        blockQue.offer("4"); //offer는 큐가 꽉차면 에러를 발생시키지 않고 false를 반환
//        blockQue.add("4"); //에러 발생
        System.out.println(blockQue);


//        우선순위큐 : 데이터를 꺼낼떄 정렬된 데이터 pop
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(20);
        pq.add(30);
        pq.add(10);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

//        더 맵게
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7; // 원하는 스코빌
        int answer = 0;

////        섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
//        for(int i : scoville){
//            pq2.add(i);
//        }
//        while (pq2.size() > 2 && pq2.peek() < K){
//            int first = pq2.poll();
//            int second = pq2.poll();
//            pq2.add(first + (second * 2));
//            answer ++;
//        }
//        System.out.println(answer);

        //리스트 방식
        List<Integer> list = new ArrayList<>();
        for(int i : scoville){
            list.add(i);
        }
        Collections.sort(list);
        while (list.size() > 2 && list.get(0) < K){

            int first = list.remove(0);
            int second = list.remove(0);
            list.add(first + (second * 2));
            answer ++;
            Collections.sort(list);
            if (list.get(0) < K){
                answer = -1;
            }
        }

        System.out.println(answer);






    }
}

