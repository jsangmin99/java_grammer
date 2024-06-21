package C06EtcClass;

public class C0601Math {
    public static void main(String[] args) {
//        0~1 미만의 임의의 double형을 반환
        double randomValue = Math.random();
        System.out.println(randomValue);
        for (int i = 0; i < 7; i++) {
            int random = (int)(Math.random() * 100);
            System.out.println(random);
        }

//        abs() : 절대값 반환
        System.out.println(Math.abs(-5)); //5

//        올림 : ceil(), 내림 : floor(), 반올림 : round()
        System.out.println(Math.ceil(3.14)); //4.0
        System.out.println(Math.floor(3.14)); //3.0
        System.out.println(Math.round(3.14)); //3

//        최대값 : max(), 최소값 : min()
        System.out.println(Math.max(10, 20)); //20
        System.out.println(Math.min(10, 20)); //10

//        pow(a, b) : a의 b승
        System.out.println(Math.pow(2, 3)); //8.0

//        sqrt() : 제곱근
//        소수 구하시
        int n = 100;
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
