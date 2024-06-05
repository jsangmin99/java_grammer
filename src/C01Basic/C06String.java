package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
//        //String 변수 생성방식
////        객체 생성 방식
//        String str1 = new String("Hello");
////        리터럴 방식
//        String str2 = "Hello";

////        참조자료형 : 기본자료형을 제외한 모든 자료형
////        WrapperClass : 기본타입을 Wrapper한 클래스
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        오토 언박싱 : Integer -> int 형변환
//        int c = b;
////        오토 박싱 : int -> Integer 형변환
//        Integer d = a;

//        String 과 int의 형변환
        int n = 10;
//        int -> String
        String str1 = Integer.toString(n);
        String str2 = String.valueOf(n);
//        String -> int
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.valueOf(str1);

//        참조자료형에 원시자료형을 담을때는 WrapperClass를 사용해야한다.
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

    }
}
