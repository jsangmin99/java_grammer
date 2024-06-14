package C01Basic;

// Stack을 활용한 함수 호출
public class C1101StackFunction1 {

    public static void main(String[] args) {
        System.out.println("메인함수 시작");
        func1();
        System.out.println("메인함수 끝");
    }

    static void func1(){
        System.out.println("func1 시작");
        func2();
        System.out.println("func1 끝");
    }

    static void func2(){
        System.out.println("func2 시작");
        System.out.println("func2 끝");
    }

}
