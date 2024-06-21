package C08Thread;

public class Library {
    static int bookCount = 100;
//    public static void  borrow() {
//        if(bookCount > 0) {
////            try {
////                Thread.sleep(100);
////            }catch (InterruptedException e){
////                e.printStackTrace();
////            }
//
//            bookCount--;
//            System.out.println("대출완료");
//            System.out.println("빌린 후 남은 책의 수 : " + bookCount);
//        }else {
//            System.out.println("대출 불가");
//        }
//
//    }




//    synchronized 키워드를 통해서 해당 메서드에 lock을 걸도록 설정
public synchronized static void  borrow() {
    if(bookCount > 0) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        bookCount--;
        System.out.println("대출완료");
        System.out.println("빌린 후 남은 책의 수 : " + bookCount);
    }else {
        System.out.println("대출 불가");
    }

}
}
