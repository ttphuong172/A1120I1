package _07_abstract_interface.homework.bank;

public class Test {
    public static void main(String[] args) {
        Account account1=new Account(123,"Phuong",80);
        Account account2=new Account(124,"Chau");
        System.out.println(account1);
        account1.paymentMoney(50);
        account1.paymentMoney(50);
        account1.paymentMoney(-150);
        System.out.println(account1);
        account1.withdrawalMoney(30);
        account1.withdrawalMoney(200);
        account1.maturity();
        account1.transferMoney(account2,100);
        System.out.println(account1);
        System.out.println(account2);

    }
}
