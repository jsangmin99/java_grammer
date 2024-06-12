package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("1111-1111-111");
//        System.out.println("만원 입금");
//        account1.deposit(10000);
//        System.out.println("100원 출금");
//        account1.withdraw(100);
//        System.out.println("현재 계좌 :" + account1.getAccountNumber() + "|잔액 : " + account1.getBalance());
//        System.out.println("백만원 출금(실패)");
//        account1.withdraw(1000000);
//
//        BankAccount account2 = new BankAccount("2222-2222-222");
//        account2.deposit(20000);
//        System.out.println("송금전");
//        System.out.println("계좌1 : " + account1.getBalance());
//        System.out.println("계좌2 : " + account2.getBalance());
//        account2.transfer(account1, 5000);
//
//        System.out.println("송금 후");
//        System.out.println("계좌1 돈받은 후 : " + account1.getBalance());
//        System.out.println("계좌2 돈 보낸 후: " + account2.getBalance());

        Scanner sc = new Scanner(System.in);


        List<BankAccount> accountList = new ArrayList<>();

        while (true) {
            System.out.println("원하시는 서비스를 선택하세요\n 1. 계좌 개설, 2. 입금, 3. 출금, 4. 이체, 0. 종료");
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            }
            BankAccount account = null;
            String accountNumber2 = null;
            switch (input) {
                case "1":  //계좌 개설
                    System.out.println("계좌번호 입력하세요");
                    account = new BankAccount(sc.nextLine());
                    accountList.add(account);
                    break;
                case "2":  //입금
                    System.out.println("계좌번호를 입력하세요");
                    accountNumber2 = sc.nextLine();
                    for (BankAccount a : accountList) {
                        if (a.getAccountNumber().equals(accountNumber2)) {
                            account = a;
                        }else {
                            System.out.println("해당 계좌번호가 없습니다.");
                        }
                    }
                    System.out.println("얼마를 입금하시겠습니까?");
                    account.deposit(Integer.valueOf(sc.nextLine()));
                    break;
                case "3":  //출금
                    System.out.println("계좌번호를 입력하세요");
                    accountNumber2 = sc.nextLine();
                    for (BankAccount a : accountList) {
                        if (a.getAccountNumber().equals(accountNumber2)) {
                            account = a;
                        }else {
                            System.out.println("해당 계좌번호가 없습니다.");
                        }
                    }
                    System.out.println("얼마를 출금하시겠습니까?");
                    account.withdraw(Integer.valueOf(sc.nextLine()));
                    break;
                case "4":  //이체
                    System.out.println("본인 계좌번호를 입력하세요");
                    accountNumber2 = sc.nextLine();
                    for (BankAccount a : accountList) {
                        if (a.getAccountNumber().equals(accountNumber2)) {
                            account = a;
                        } else {
                            System.out.println("해당 계좌번호가 없습니다.");
                        }
                    }
                    System.out.println("이체할 계좌번호를 입력하세요");
                    String accountNumber = sc.nextLine();
                    BankAccount transferAccount = null;
                    for (BankAccount a : accountList) {
                        if (a.getAccountNumber().equals(accountNumber)) {
                            transferAccount = a;
                        }else {
                            System.out.println("해당 계좌번호가 없습니다.");
                        }
                    }
                    System.out.println("얼마를 이체하시겠습니까?");
                    account.transfer(transferAccount, sc.nextInt());
                    break;
            }

        }



    }
}
