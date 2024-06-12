package C02ClassBasic;

public class BankAccount {
    private String accountNumber;
    private Integer balance;

    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void deposit(Integer amount){
        this.balance += amount;
        System.out.println(this.accountNumber +"에"+  amount+ "원 입금이 완료되었습니다.");
        System.out.println(this.accountNumber+  "의 현재 잔액은 " + this.balance + "원 입니다.");
    }

    public void withdraw(Integer amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println(this.accountNumber + "에서" + amount + "원 출금되었습니다.");
        }
        else {
            System.out.println("출금액 보다 잔액이 부족합니다.");
        }
        System.out.println(this.accountNumber + "의 현재 잔액은 " + this.balance + "원 입니다.");
    }

    public void transfer(BankAccount account, Integer amount){
        if(this.balance >= amount){
            this.balance -= amount;
            account.deposit(amount);
            System.out.println(amount + "원 이체되었습니다.");
        }
        else {
            System.out.println("이체액 보다 잔액이 부족합니다.");
        }
        System.out.println(this.accountNumber +" 의현재 잔액은 " + this.balance + "원 입니다.");
    }

}
