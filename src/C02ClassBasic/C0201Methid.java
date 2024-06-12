package C02ClassBasic;

public class C0201Methid {
    public static void main(String[] args){
//        메서드를 사용하는 이유 : 코드의 중복이 제거되고, 코드의 가독성이 높아진다.

//        메서드 호출
        if(C0201MethodPractice.isPrime(10)){
            System.out.println("소수입니다.");
        }else{
            System.out.println("소수가 아닙니다.");
        }


        C0201MethodPractice.isPrimePrint(10);
    }

//    int 라는 리턴 타입을 가짐
//    input(매개변수) 값을 int 2개를 받음
//    메서드 구성요소 : 리턴타입, 메서드명, 매개변수, 접근제어자(public), 클래스 메서드 여부(static)
//    static이 붙으면 클래스 메서드, 안붙으면 인스턴스 메서드

    public static int sumAcc(int a, int b){
        int total = 0;
        for (int i = a; i <= b; i++) {
            total += i;
        }
        return total;
    }

}
