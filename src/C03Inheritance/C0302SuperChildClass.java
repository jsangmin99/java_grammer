package C03Inheritance;

class SupperParents{
    int a;
    private int b = 20;

    SupperParents(int a){
        this.a = a;
    }
    void display(){
        System.out.println("부모클래스 입니다.");
    }

}
public class C0302SuperChildClass extends SupperParents{
    int a;
    int c;

    C0302SuperChildClass() {
//        super() : 부모클래스의 생성자를 의미
//        super.변수명 : 부모클래스의 변수를 의미
        super(30);
        this.a = 10;
        this.c = 20;
    }

    public static void main(String[] args) {
        C0302SuperChildClass c1 = new C0302SuperChildClass();
        c1.display2();
    }

    void display2(){
        System.out.println("this.a : " + this.a);
        System.out.println( "super.a : " + super.a);
    }
}

