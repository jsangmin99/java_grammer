package C02ClassBasic;

public class C0201MethodPractice {
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void isPrimePrint(int num) {
        if (num == 1){
            System.out.println("소수가 아닙니다.");
            return;
        };
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            };
        }
        System.out.println("소수입니다.");
    }
}
