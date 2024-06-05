package C01Basic;

public class C03Operater {
    public static void main(String[] args) {
////        산술 연산자 : 사칙연산
//        int n1 = 8, n2 = 3;
////        *:곱셈, /:나눗셈, %:나머지
////        +, -, *, / ,% 결과값 출력
//        System.out.println("n1 + n2 = " + (n1 + n2));
//        System.out.println("n1 - n2 = " + (n1 - n2));
//        System.out.println("n1 * n2 = " + (n1 * n2));
//        System.out.println("n1 / n2 = " + ((double)n1 / n2));
//        System.out.println("n1 % n2 = " + (n1 % n2));

//        대입연산자
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//
//        n1 = n1 - 3;
//        n2 -= 3;
//        n3 = -3;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//
//        int n4 = 10;
//        int n5 = 10;
//        n4 /= 3;
//        System.out.println(n4);
//
//        System.out.println("## 정리 ##");
//        int a = 10;
//        a = a + 1;
//        System.out.println(a);
//        a += 1;
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        ++a;
//        System.out.println(a);
//        int c = 10;
//        System.out.println(c++);
//        c = 10;
//        System.out.println(++c);
//
////        비교연산자 : ==, !=, > >= 등
//        char ch1 = 'a';
//        char ch2 = 'b';
//        System.out.println(ch1 == ch2);
//        System.out.println(ch1 != ch2);
//
//        논리연산자 : &&,||, !
        int num1 = 10, num2 = 20;

//        num1 이 5보다 큰지와 num1이 20보다 작은지 and 조건을 통해 boolean 갑 세팅
        boolean result1;

        result1 = num1 > 5 && num1 < 20;
        System.out.println(result1);

//        num1가 10보다 작은 조던과 num2가 30 보다 작은 조건을 or조건으로 boolean 값 세팅
        boolean result2 = !(num2 <10 || num2 <30);
        System.out.println(result2);

//        비트 연산자 : &, |, ^, ~
        int n1 = 5;
        int n2 = 4;
        int n3 = n1 & n2;
        System.out.println(n3); //4
        int n4 = n1 | n2;
        System.out.println(n4);// 5
        int n5 = n1 ^ n2;
        System.out.println(n5); //1 => 00000001
        System.out.println(~n5);// -2

//        시프트 연산 : << 왼쪽으로 이동, >> 오른쪽으로 이도
//        왼쪽으로 하난 이동한다는 의미는 2를 곺한다는 의미
        System.out.println(n4 << 1); // 10

    }
}
