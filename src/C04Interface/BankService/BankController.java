package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요");
        String accountNumber = sc.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber);

        while (true){
            System.out.println("서비스 번호를 입력하세요. 1.카드 2.카카오페이 3.출금 4.입금");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            int number2 = Integer.parseInt(sc.nextLine());

            int money = 0;
            if(number == 1){
                System.out.println("카드서비스입니다.");
                BankCardService bankCardService = new BankCardService();
                if(number2 ==1) {
                    System.out.println("입금할 금액을 입력하세요");
                    money = Integer.parseInt(sc.nextLine());
                    bankCardService.deposit(money, bankAccount);
                }else{
                    System.out.println("출금할 금액을 입력하세요");
                    money = Integer.parseInt(sc.nextLine());
                    bankCardService.withdraw(money, bankAccount);
                }
            }else if (number == 2) {
                System.out.println("카카오페이 서비스입니다.");
                BankKakaoService bankKakaoService = new BankKakaoService();
                if(number2 ==1) {
                    System.out.println("입금할 금액을 입력하세요");
                    money = Integer.parseInt(sc.nextLine());
                    bankKakaoService.deposit(money, bankAccount);
                }else {
                    System.out.println("출금할 금액을 입력하세요");
                    money = Integer.parseInt(sc.nextLine());
                    bankKakaoService.withdraw(money, bankAccount);
                }

            }


        }
    }
}
