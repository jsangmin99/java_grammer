package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

//        // 출력  : System.out(콘솔출력)
//        int a = 20;
////        println : 출력후 줄바꿈
////        print : 줄바꿈 없이 출력
//        System.out.print(a);
//        String b = "hello wordl";
//        System.out.println(b);
//
//        System.out.println(10 +20);

        // 입력 : System.in(키보드 입력)
        Scanner sc = new Scanner(System.in);
//        System.out.println("아무 문자열을 입력해 주세요");
////        nextLine은 입력받은 데이터를 한줄 읽어서 String으로 리턴
//        String input = sc.nextLine();
//        System.out.println(input);
////--
//        System.out.println("더하기할 두 숫자를 입력하게요");
//        int a1 = sc.nextInt();
//        int a2 = sc.nextInt();
//        System.out.println("두 숫자를 더한 값은" + (a1 + a2) + "입니다.");

//        System.out.println("실수를 입력해주세요");
//        double input_double = sc.nextDouble();
//        System.out.println(input_double);


        System.out.println("true/false를 입력해주세요");
        boolean input_boolean = sc.nextBoolean();
        System.out.println(input_boolean);

//        java 밖의 시스템이므로 입출력 시스템 메모리 해제 해주는 것이 좋다.
        sc.close();

    }

}
