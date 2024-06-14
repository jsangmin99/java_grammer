package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1부터 10까지 누적 합계
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("for문 종료");

//        재귀함수로 1부터 10까지 누적 합계
        int sum2 = recursiveSum(10);
        System.out.println("재귀함수 종료");


//        100번째 피보나치 수열 구현 for문으로
        int[] fibo = new int[100];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 100; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println(fibo[99]);
        System.out.println("for문 종료");

//        100번째 피보나치 수열 구현 재귀함수로
        int[] fibo2 = new int[100];
        fibo2[0] = 0;
        fibo2[1] = 1;
        recursiveFibo(2, fibo2);
        System.out.println(fibo2[99]);
        System.out.println("재귀함수 종료");


    }
    static void recursiveFibo(int n, int[] fibo) {
        if (n == 100) {
            return;
        }
        fibo[n] = fibo[n - 1] + fibo[n - 2];
        recursiveFibo(n + 1, fibo);
    }

    static int recursiveSum(int n){
        if(n == 1){
            return 1;
        }
        return n + recursiveSum(n-1);
    }

}
