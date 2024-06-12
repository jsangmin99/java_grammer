package C02ClassBasic;

public class C0204MethodOverloading {
    public static void main(String[] args) {
        C0204MethodOverloading c1 = new C0204MethodOverloading();
        c1.sum(1, 2);
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum(1.1, 2.2));
        System.out.println(c1.sum(1, 2, 3));
    }

//    접근제어자를 안붙이면 기본적으로 default 접근제어자가 붙는다. (default 접근제어자는 같은 패키지 내에서만 접근 가능)
    int sum(int a, int b){
        return a + b;
    }
//    메소드 오버로딩
    double sum(double a, double b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

}
