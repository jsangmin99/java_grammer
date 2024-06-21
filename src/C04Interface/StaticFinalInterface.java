package C04Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements m1 = new MyImplements();
        m1.methodA();
//        MyInplemnts에 my_constant변수가 상속(static final이므로 상속됨)
        System.out.println(MyImplements.my_constant);
    }

}
interface  MylInterface {
    //    아래 변수는 컴파일 시점에 상수로 치환됨
    int my_constant = 10;
    void methodA();

}
class MyImplements implements MylInterface {
    @Override
    public void methodA() {
        System.out.println("methodA");
    }
}
