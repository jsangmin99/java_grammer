package C03Inheritance;

import java.util.List;

//final 클래스 상속 불가
//public class C0305Others extends FinalClass{
public class C0305Others {
    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
//        추상 클래스와 인터페이스느 구현없이 객체생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
//        List<Integer> myList = new List<Integer>();
        AbstractAnimal animal = new AbstractDog();
    }
}

//final을 클래스에 붙이면 상속 불가한 클래스 생성
final class FinalClass{
}

class AbstractClass{
    //abstract 클래스는 객체 생성 불가
    //AbstractClass ac = new AbstractClass();
}
//추상 클래스
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물 소리르 r니다.1");
    }
//    오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물 소리르 냅니다.2");
    }

//    absrtct 키워드는 자식클래스로 하여금 오버라이딩 강제
//    abstract 메서드가 하나라도 있은면 반드시 클래스에도 abstract 키워드를 붙여야 함
//    리턴타입과 매개변수만 정의,

    abstract void makeSound3();
}
class AbstractDog extends AbstractAnimal{

    @Override
    void makeSound1(){
        System.out.println("멍멍");
    }

    @Override
    void makeSound3() {
        System.out.println("멍멍3");
    }
//    @Override
//    void makeSound2(){
//        System.out.println("멍멍 2");
//    }
}