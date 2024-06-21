package C08Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

////        쓰레드 생성 방법 2가지 :
////        1. 쓰레드 상속 방식
//        Thread t1  = new Thread1();
////        start() 메서드가 상속되어 있고, 이메서드를 통해 run메서드 실행
//        t1.start();
//        Thread t2 = new Thread1();
//        t2.start();
//
////        2. Runnable 구현한 객체를 Thread 생성자에 전달
//        Thread t3 = new Thread(new Thread2());
//        t3.start();
//        new Thread(new Thread2()).start();
//        new Thread(() -> System.out.println("Thread3 실행 시작")).start();







//        동시성 이슈 테스트
//        단일 쓰레드 ,동기적 코드(문제 없음)
//        for (int i = 0 ; i< 1000; i++){
//            Library.borrow();
//        }

////        비동기 코드, 멀티쓰레드 (문제 있음)
//        for (int i = 0; i < 100000; i++) {
//            int I = i;
//            new Thread(() -> {
//                System.out.println("Thread " + I + " 실행 중");
//                try {
//                    Library.borrow();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }).start();
//        }

//        System.out.println("최종적으로 남은 책 수량 : " + Library.bookCount);



//        동시성 이슈 해결방법 2가지
//        1. join() 메서드를 사용
//        2. synchronized 를 사용

////        join() : 다른 쓰레드의 완료전까지 새로운 쓰레드가 실해되지 않음
//        for (int i = 0; i < 1000; i++){
//            Thread t1 = new Thread(() -> Library.borrow());
//            t1.start();
//            t1.join();
//        }

//        synchronized를 사용한 내용
       for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
        }

    }
}
