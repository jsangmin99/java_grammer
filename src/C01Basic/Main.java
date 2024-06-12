package C01Basic;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 백준 보물
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        sort(a);
        sort(b);
        for(int i = 0; i < n; i++){
            sum += a[i] * b[n - i - 1];
        }

        System.out.println(sum);
    }
}
