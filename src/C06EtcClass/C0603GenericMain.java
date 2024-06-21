package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] strArr = {"apple", "banana", "orange"};
        stChange(strArr, 0, 1); //
        System.out.println(Arrays.toString(strArr));

        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        genericChange(intArr, 1, 2);
        System.out.println(Arrays.toString(intArr));

        Person p1 = new Person();
        p1.setValue("JeonSangmin");

        GenericPerson<String> p2 = new GenericPerson<>();
        p2.setValue("JeonSangmin");
        GenericPerson<Integer> p3 = new GenericPerson<>();
        p3.setValue(100);

//        제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");

//        컴파일후 제네릭 소거
        List list = new ArrayList();
        list.add("apple");
        list.add("banana");

        String str = (String) list.get(0);
        System.out.println(str);

    }

//    제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    유의점 : 제네릭은 객체타입이 들어와랴 함

    static <T> void genericChange( T[] strArr, int start, int end){
        T temp = strArr[end];
        strArr[end] = strArr[start];
        strArr[start] = temp;

    }

    static void stChange(String[] strArr, int start, int end){
        String temp = strArr[end];
        strArr[end] = strArr[start];
        strArr[start] = temp;
    }
    static void intChange(Integer[] intArr, int a, int b) {
         int temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = temp;
    }



}
//    제네릭 클래스는 클래스명 옆에 <T>선언
class GenericPerson<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
