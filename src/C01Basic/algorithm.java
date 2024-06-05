package C01Basic;
import java.util.Scanner;

public class algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String output = input.toUpperCase();
        System.out.println(output);
        sc.close();
    }
}
