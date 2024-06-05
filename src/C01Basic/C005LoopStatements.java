package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C005LoopStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //입력한 숫자의 구구단 단수 출력
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * " + i + " = " + n * i);
//        }
//
//        while (true){
//            System.out.println("원하시는 단수를 입력해주세요");
//            sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            int num = 1;
//            while (num <= 10) {
//                System.out.println(input + " * " + num + " = " + input * num);
//                num++;
//            }
//        }


////        반복있는 도어락 5회이상 틀릴경우 입력횟수가 초과했습니다.
//        String answer = "1234";
//        int count = 0;
//        while (true) {
//            String input = sc.nextLine();
//            count++;
//            if(answer.equals(input)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                if (count == 5) {
//                    System.out.println("비밀번호 입력횟수 초과");
//                    break;
//                }
//            }
//        }

//        result에 숫자 num 을 반대로 뒤집은 숫자를 넣어주세요
//        나머지 %를 활용

//        int num = 1234;
//        int result = 0;
//        while (num != 0) {
//            result = (result) * 10 + (num % 10);
//            num /= 10;
//        }
//        System.out.println(result);
//
//    }

////    1~10 중레 홀수만 출력하기
//        for (int i = 1; i <= 20; i += 2) {
//            System.out.println(i);
//        }

////    1~20 까지의 수 중에 짝수를 모두 더한 값
//        int sum = 0;
//        for (int i = 2; i <= 20; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);


//        //    최대 공약수 구하기
//        int a =24, b = 36;
//        int result = 0;
//        int max = a > b ? a : b;
//        for (int i = 1; i <= max; i++) {
//            if (a % i == 0 && b % i == 0) {
//                result = i;
//            }
//        }
//        System.out.println(result);

////        소수구하기 : 1과 자기자신을 제외한 숫자로, 나누어지지 않는 수
////        1 ~24 까지 수중에 소수를 출력
//        for(int i = 2 ; i <= 24; i++){
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if(i % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println(i);
//            }
//        }

////        홀수만 출려하기 1~ 10 까지
//        for (int i = 1; i <= 10; i++) {
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }
////        배열 값을 +10씩 하기
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < 5; i++) {
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));

////        enganced for문 (향상된 for 문 - for each)
//
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        System.out.println(myList.toString());

////        2단 for문 구구단
//        for(int i = 2; i <= 10; i++){
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//        }

////        직사각형 별찍기
//        for(int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

////        For 라벨문1
//        boolean flag = false;
//        for(int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + " " + j);
//                if(i == 2 && j == 2){
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag) break;
//        }
//
////        For 라벨문2
//        loop1 :
//        for(int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + " " + j);
//                if(i == 2 && j == 2){
//                    break loop1;
//                }
//            }
//        }


//        라벻문 활요해서 값 찾기
//        먼저 11을 찾으렴 3,1에 11이 있습니다. 라고 출력 후 종료
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10, 11, 12}};

        loop1 :
        for(int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] == 11) {
                    System.out.println(i + "행 " + j + "열에 11이 있습니다.");
                    break loop1;
                }
            }
        }


////        Call by value
//        String s = new String("abc");
//        String s2 = s; // "abc"
//
//        foo(s);
//
//        System.out.println("#3 " + s.equals("abc")); // true
//        System.out.println("#4 " + s.equals("ccc")); // false
//        System.out.println("#5 " + (s==s2)); // true
//
//        //만약 call by reference라면
//        // System.out.println(s.equals("ccc")); // true
//        // System.out.println(s==s2); // true
//    }
//
//    static void foo(String str) {
//        System.out.println("#1 " +str.equals("abc")); // true
//        str = new String("ccc");
//        System.out.println("#2 " + str.equals("ccc")); // true

    }
}
