package C10Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C1001ReflectionBasic {
    public static void main(String[] args) {
        try {
            // 객체 생성 방법 1. 기존의 방식
            Calculator calculator = new Calculator("Samsung");
            calculator.sayHello();

            // 객체 생성 방법 2. 런타임 환경에서 리플렉션 기술을 통해 객체 생성 및 메서드 호출
            // <?> 제네릭 표현으로 어떤 클래스 타입도 가능하다는 표현
            // getClass 메서드는 런타임 시점에 calculator 객체의 클래스 정보를 가져온다.
            Class<?> myClass = calculator.getClass();

            // 객체 생성 2-1 (리플렉션의 동작 방식)
            Calculator cal1 = (Calculator) myClass.getConstructor(String.class).newInstance("LG");

            // 메서드 호출 (== cal1.sayHello();)
            Method cal1Method = myClass.getMethod("sayHello");
            cal1Method.invoke(cal1);

            // 객체 생성 2-2
            Calculator cal2 = Calculator.class.getConstructor(String.class).newInstance("Apple");
            // 메서드 호출 (== cal2.sayHello();)
            Method cal2Method = Calculator.class.getMethod("sayHello");
            cal2Method.invoke(cal2);

            // 리플렉션 기술을 통해 필드 접근 및 수정
            Field nameField = Calculator.class.getDeclaredField("name");
            nameField.setAccessible(true); // private 필드 접근 허용
            nameField.set(cal1, "Casio"); // 필드 값 수정
            cal1Method.invoke(cal1); // 수정된 값 출력

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

class Calculator {
    private String name;

    public Calculator() {
    }

    public Calculator(String name) {
        this.name = name;
    }

    public void sayHello() { // sayHello 메서드를 public으로 변경
        System.out.println("Hello My name is " + name);
    }
}
