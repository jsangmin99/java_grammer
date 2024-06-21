package C07Exception;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C0701Exeption {
    public static void main(String[] args) {
        System.out.println("나눗셈 프로그램입니다.");
        Scanner sc = new Scanner(System.in);

//        예외가 발생할 것으로 예상되는 코드에 try로 감싸고
//        예외가 발생했을때 대응하는 코드를 catch로 감싸준다.
        try {
            System.out.println("분자를 입력하세요.");
            int head = sc.nextInt();
            System.out.println("분모를 입력하세요.");
            int tail = sc.nextInt();
            int result = head / tail;
            System.out.println("나눈 결과 값은 " + result + "입니다.");

        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
            // 에외가 발생된 내역을 로그로 남기기 위함
            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("숫자만 입력해주세요.");
//            Exception은 모든 예외를 처리한다.
        }catch (Exception e){
            System.out.println("예외가 발생했습니다.");
        }finally {
            System.out.println("프로그램을 종료합니다.");
        }
        login1("12345678");

        try {
            login2("12345678");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    //    unchecked exception 에서는 throws 키워드가 예외사항을 명시하는 용도로만 사용한다.
    static void login1(String password) throws IllegalArgumentException {
        if (password.length() < 10) {
//            theow new : 예외를 강제로 발갱
//            에외를 기본적으로 메서드를 호출한쪽에 던진다.
//            unchecked exception : 에외처리가 강제되지 않음
            throw new IllegalArgumentException("비밀번호는 8자 이상이어야 합니다.");
        }
        if (password.contains("*")) {
            throw new RuntimeException("비밀번호에 특수문자를 사용할 수 없습니다.");
        }
    }

//    checked exception : 예외처리가 강제됨
    private static void login2(String password) throws SQLException{
////        방법1 . 직접 예외처리
//        try {
//            if(password.length() < 10){
//                throw new SQLException("DB조회에서 에러가 발생했습니다.");
//            }
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }

//        방법2. 메서드를 호출한 쪽에 위림
        if(password.length() < 10){
            throw new SQLException("DB조회에서 에러가 발생했습니다.");
        }

    }

}
