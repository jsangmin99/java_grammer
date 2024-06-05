package C01Basic;

import java.util.PriorityQueue;
import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        int password = 1234;
        Scanner sc = new Scanner(System.in);
//        int inputPassword = sc.nextInt();
//        if (password == inputPassword) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        알파벡이 소문자인지 판별하는 프로그램
//        char alpha = sc.next().charAt(0);
//        if (alpha >= 'a' && alpha <= 'z') {
//            System.out.println("소문자입니다.");
//        } else if(alpha >= 'A' && alpha <= 'Z') {
//            System.out.println("대문자 입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }

//        택시 요금 :10000, 버스요금 : 3000, 킥보드 2000
//        사용자에게 얼마있느지 물어보고 구간별로 교통수단 추천
        int money = sc.nextInt();
        if(money >= 10000) {
            System.out.println("택시를 타세요");
        } else if (money >= 3000) {
            System.out.println("버스를 타세요");
        } else if (money >= 2000) {
            System.out.println("킥보드를 타세요");
        } else {
            System.out.println("걸어가세요");
        }

//        if문이 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면 모든 IF문이 중복되어 실행될 가능성이 높다
//        if (money >= 10000)
//            System.out.println("택시를 타세요");
//        if (money >= 3000)
//            System.out.println("버스를 타세요");
//        if (money >= 2000)
//            System.out.println("킥보드를 타세요");
//


    }
}
