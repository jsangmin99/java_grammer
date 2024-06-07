package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

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

////        String 과 int의 형변환
//        int n = 10;
////        int -> String
//        String str1 = Integer.toString(n);
//        String str2 = String.valueOf(n);
////        String -> int
//        int num1 = Integer.parseInt(str1);
//        int num2 = Integer.valueOf(str1);
//
////        참조자료형에 원시자료형을 담을때는 WrapperClass를 사용해야한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

////        참조자료형에 원시자료형을 담을때는 WrapperClass를 사용해야한다.
//        List<String> list2 = new ArrayList<>();
//        list2.add("Hello");
//        list2.add("World");
//        list2.add("Java");
//
//        String st1 = new String("Hello");
//        String st2 = "Hello";
//        String st3 = new String("Hello");
//        String st4 = "Hello";
//        System.out.println(st1 == st3); //false
//        System.out.println(st2 == st4); //true
//
////        앞으로 String은 equals로 비교하자
//        System.out.println(st1.equals(st3)); // true
//        System.out.println(st2.equals(st4)); // true

////        문자열길이 : length();
//        String str = "Hello java world";
//        System.out.println(str.length()); // 16
//
////        indexOF : 특정 문자열의 위치를 반환 가장 먼저 나오는 문자열의 위치
////        lastIndexOf : 특정 문자열의 위치를 반환 가장 마지막에 나오는 문자열의 위치
//        System.out.println(str.lastIndexOf("java")); // 6
//        System.out.println(str.indexOf("a")); // 7
//
////        contains : 특정 문자열이 포함되어 있는지 확인
//        System.out.println(str.contains("java")); // true
//        System.out.println(str.contains("world")); // true
//        System.out.println(str.contains("python")); // false
//
////        charAt : 특정 index의 문자(char)값을 리턴;
//        String st = "abcdefgabcdefg";
//        char ch1 = st.charAt(1);
//        System.out.println(ch1); // b
//
////        위의 문자열에 a의 개수가 몇개인지 count
//        System.out.println("위의 문자열 a의 개수가 몇개인지 count");
//        int count = 0;
//        for (int i = 0 ; i < st.length(); i++) {
//            if (st.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);
//        //    toCharArray : 문자열을 char[]로 변환
//        System.out.println(Arrays.toString(st.toCharArray()));
//
////        toCharArray를 활용해서 a가 몇개인지 count 향상된 for문 사용
//        count = 0;
//        for (char c : st.toCharArray()) {
//            if (c == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//
////        문자열 더하기 : += -> 느리다.
////        연산은 느리지 않지만 메모리에 접근해서 재할당하는것이 느리다.
//        String str1 = "Hello";
//        str1 += " Java";
//        System.out.println(str1);


////        subStrin(a,b) : a부터 b까지의 문자열을 반환
//        String st1 = "Hello Java";
//        System.out.println(st1.substring(0,5)); //Hello
//        System.out.println(st1.substring(6,10));// Java
//        System.out.println(st1.substring(6,st1.length()));

////        trim, strip : 문자열 앞뒤 공백 제거
//        String st2 = "   Hello Java   ";
//        String trimSt2 = st2.trim();
//        String stripSt2 = st2.strip();
//        System.out.println(trimSt2);
//        System.out.println(stripSt2);
//
////        toUpperCase, toLowerCase : 대문자, 소문자로 변환
//        String st3 = "Hello Java";
//        System.out.println(st3.toUpperCase());
//        System.out.println(st3.toLowerCase());
//
////        char -> String
//        char ch = 'a';
//        String st4 = String.valueOf(ch);
//        String st5 = Character.toString(ch);
//        System.out.println(st4);

////        replace : 특정 문자열을 다른 문자열로 변경
//        String st6 = "Hello Java";
//        String st7 = st6.replace("Java","Python");
//        System.out.println(st7);

////        replaceAll(a,b) : replace와 동일한 기능, 정규표현식을 쓸수있음
//        String st1 = "01abcd1234한글입니다.1234";
////        for 문 활용해서 알파벳 소문자 제거
//        String result = "";
//        for (int i = 0; i < st1.length(); i++){
//            if (st1.charAt(i) < 'a' || st1.charAt(i) > 'z') {
//                result += st1.charAt(i);
//            }
//        }
//
//        //replaceAll 활용해서 알파벳 소문자 제거
//        //[가-힣] ; 한글
//        // [0-9] ; 숫자
//        // [a-z] ; 소문자
//        // [A-Z] ; 대문자
//        // [A-Za-z] ; 대소문자
//        result = st1.replaceAll("[a-z]","");
//        //replaceAll 활용해서 알파벳 대소문자 제거
//        result = st1.replaceAll("[A-Za-z]","");
//
//        System.out.println(result);
//
////        String의 matches와 Pattern.matches의 차이
//        String test = "Hello";
//        System.out.println(test.matches("[A-Za-z]")); // false
//        System.out.println(test.matches("[A-Za-z]+")); // true
//
////        ^ : 시작, $ : 끝 , *:빈값 포함
//        boolean m1 = Pattern.matches("[A-Za-z]+",test); // true
//        System.out.println(m1);


////        전화번호 패턴검증
//        while(true){
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)){
//                System.out.println("올바르게 입력했습니다.");
//            }else {
//                System.out.println("잘못 입력했습니다.");
//            }
//        }

////        이메일 검증 : 소문자알파벳과 숫자로 @ 알파벳.com
//        String email = "jsangmin99@gmail.com";
//        boolean b3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com+$", email);
//        System.out.println(b3);
//        }


////        split : 특정문자를 기준으로 문자열을 자르는것, 문자열 배열을 return.
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));
//        String b = "a b c  d";
//        String b_arr = Arrays.toString(b.split("\\s+"));
//        System.out.println(b_arr);


////        isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = " ";
//
////        equal 아님
//        System.out.println(st1 == st2); //false
//
////        문제발생 X
//        System.out.println(st1 == null); //true
////        문제발생 O : NullPointerException 발생
////        System.out.println(st2.isEmpty()); //false

//        join  : String[]을 하나의 문자열로 합칠때 사용
        String[] arr = {"a","b","c","d"};
        String result = String.join(" ",arr);
        System.out.println(result);

//        StringBuffer
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" java");
        sb1.append(" world");
        System.out.println(sb1);

        sb1.insert(5, " Python");
        System.out.println(sb1);

        sb1.delete(17, sb1.length());
        System.out.println(sb1);


//        StringBuilder
//        (String +=) < (StringBuffer) < (StringBuilder)
//        StringBuiler는 쓰레드 safe 하지 않다.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append("\n Java");
        sb2.append("World");
        System.out.println(sb2);

//        StringBuilder를 글자를 3개씩 반복
        String st = "hello";
        StringBuilder sb3 = new StringBuilder();
        for(int i = 0; i <st.length(); i++){
            sb3.append(st.charAt(i));
            sb3.append(st.charAt(i));
            sb3.append(st.charAt(i));
        }
        System.out.println(sb3);








    }
}

//    프로그래머스 문자열 다루기
//class Solution {
//    public boolean solution(String s) {
//        boolean answer = true;
//        //문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
//        if (s.length() == 4 || s.length() == 6) {
//            if (s.matches("[0-9]+")) {
//                answer = true;
//            } else {
//                answer = false;
//            }
//        } else {
//            answer = false;
//        }
//        return answer;
//    }
//}



//    class Solution {
//        public String solution(String s) {
//            String answer = "";
//            int n = s.length()/2;
//            if(s.length()%2 == 0)
//                answer += s.substring(n-1,n+1);
//            else
//                answer += s.substring(n,n+1);
//            return answer;
//        }
//    }

//    String my_string = "Hello Java";
//    String letter = "a";
//    public String solution(String my_string, String letter) {
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.substring(i ,i+1).equals(letter)) {
//                answer += my_string.substring(i,i+1);
//            }
//        }
//        return answer;
//    }


////          프로그래머스 특정문자열 제거하기
//        public String solution(String my_string, String letter) {
//            String answer = "";
//            for (int i = 0; i < my_string.length(); i++) {
//                if (my_string.charAt(i)~=letter.charAt(0)) {
//                    answer += my_string.charAt(i)
//                }
//            }
//            return answer;
//        }


//class Solution {
//    public int solution(String A, String B) {
//        int answer = 0;
//        String s = "";
//        if(A == B){
//            return 0;
//        }
//        s = A + A;
//        if(s.contains(B)){
//            answer++;
//        }else{
//            answer = -1;
//        }
//
//        return answer;
//    }
//}