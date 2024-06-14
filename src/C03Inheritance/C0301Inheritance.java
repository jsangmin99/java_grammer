package C03Inheritance;


class Parent {
    int a = 10;
    private int b = 20;

    void parentMethod(){
        System.out.println("부모클래스 입니다.");
    }
    void parentMethod2(){
        System.out.println("부모클래스 입니다.");
    }
}

// extends 키워드를 사용하여 상속을 받는다.
public class C0301Inheritance extends Parent {
    int c = 30;

//    overriding : 부모클래스의 메서드를 자식클래스에서 재정의
//    성능의 최적화를 위해 붙여주는게 좋은것으로 알려져 있음
    @Override
    void parentMethod(){
        System.out.println("부모클래스가 아니라 자식클래스 입니다.");
    }

    void childMethod(){
        System.out.println("자식클래스 입니다.");
    }

    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        자식 클래스라 하더라도 private 변수는 상속 및 접근불가
        System.out.println(c1.a);
        System.out.println(c1.c);
//        메서드 상속
        c1.parentMethod();
        c1.childMethod();
        c1.parentMethod2();

    }

}
