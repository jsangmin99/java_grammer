import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 개행 문자 소비
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String result = s.toLowerCase();
            System.out.println(result);
        }
        sc.close();  // Scanner 객체 닫기
    }
}
