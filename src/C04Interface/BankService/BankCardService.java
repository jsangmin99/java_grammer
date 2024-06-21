
package C04Interface.BankService;

public class BankCardService implements BankService{

    @Override
    public void deposit(int money, BankAccount bankAccount){
        int myMoney = bankAccount.getBalance();
        int total = myMoney + money;
        bankAccount.updateBalance(total);

        System.out.println(money+"원 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 " + bankAccount.getBalance() + "원 입니다.");
    }
    @Override
    public void withdraw(int money, BankAccount bankAccount){
        if(bankAccount.getBalance() < money){
            System.out.println("잔액 부족입니다.");
        }else {
            int total = bankAccount.getBalance() - money;
            bankAccount.updateBalance(total);
            System.out.println(money + "원 카드로 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + bankAccount.getBalance() + "원 입니다.");
    }
}