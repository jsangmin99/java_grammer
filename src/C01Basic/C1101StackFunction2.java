package C01Basic;

public class C1101StackFunction2 {
    public static void main(String[] args) {
        System.out.println("메인함수 시작");
        func1(1);
        System.out.println("메인함수 끝");
    }

    static int func1(int a){
        System.out.println("func1 시작"  + a);
        System.out.println("func1 끝");
        return func1(a+1);
    }

}
