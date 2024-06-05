package C01Basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02Variable {
    public static void main(String[] args) {
//        정수 : byte(1바이트), int (4바이트), long(8바이트)
        byte a = 127;
        byte b = -128;

//        오버플로우 발생
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        int int_a = 10;
//        long 명시적으로 L을 붙여 long타입임을 명시하기도 함
        long long_a = 20L;
        System.out.println(int_a);
        System.out.println(long_a);

//        실수 :  float, double(기본)
//        float f1 = 1.123f;
//        double d1 = 1.123;

//        부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total += 0.1;
//        }
//        System.out.println(total);
//
//        total = 0;
//        for (int i = 0; i <1000 ; i++) {
//            total += 1;
//        }
//        System.out.println(total/10);


//        소수점 오차의 대안으로 Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
////        Bigdecimal의 원리 : 저장할떄 문자열로 저장해서 연산할때 정수로 변환, 최종 결과는 실수로 변환
//        BigDecimal b1 = new BigDecimal("1.03");
//        BigDecimal b2 = new BigDecimal("0.43");
//        double result = b1.subtract(b2).doubleValue();
//
////        문자형 : char
//        char m1 = '가';
//        System.out.println(m1);
//
////        boolean : true or false
//        boolean bool1 = true;
//        boolean bool2 = false;
//
//        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        if(input1>0)
//            System.out.println("입력하신 값은 0보다 큼니다.");
//
//
////        타입 변환
////        묵시적 타입 변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//        //알파벳 비교를 위한 묵시적 타입 변환 발생
//        System.out.println('a' > 'b');
//
//        //double이 더 커서 묵시적 형변환 가능
//        int i3 = 10;
//        double d3 = i3;
//
////        double -> int 로의 형변환은 불가능
//
//        double d4 = 10.5;
//        //int i4 = d4;
////        명시적 형변환은 가능
////        대신에 소수점이 절사
//        int i4 = (int) d4;
//
//
////        명시적 타입변환
//        System.out.println((int) ch1);
//
//        int x = 1;
//        int y = 4;
//        int z = 1 / 4;
////        int/int 이므로 결과값을 int로 판단하여 소수점 절사
//        double d5 = z;
//        System.out.println(1/4);
////        두값중 한값만이라고 double로 명시적 형변환 시켜주면 결과값 double
//        System.out.println((double) 1/4);
//
////        변수와 상수
////        변수값 재할당 가능
//        int aa1 = 10;
//        aa1 = 120;
////        상수는 재할당 불가능
////        상수는 final 키워드를 통해 표현
////        일반적으로 상수값은 대문자로 표현
//        final int AGES = 20;
////      AGES = 30;



    }
}
