package _07_abstract_interface.homework.bank;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long bankAccount;
    private String accountName;
    private double amount;
    final double INTERREST = 0.035;

    public Account() {
    }

    public Account(long bankAccount, String accountName, double amount) {
        this.bankAccount = bankAccount;
        this.accountName = accountName;
        this.amount = amount;
    }

    public Account(long bankAccount, String accountName) {
        this.bankAccount = bankAccount;
        this.accountName = accountName;
        this.amount = 50;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        Locale locale=new Locale("vi","VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return "Account{" +
                "bankAccount=" + bankAccount +
                ", accountName='" + accountName + '\'' +
                ", amount=" + format.format(amount)  +
                '}';
    }

    public void paymentMoney(double paymentAmount) {
        if (paymentAmount <= 0) {
            paymentAmount = 0;
        } else {
            paymentAmount = paymentAmount;
        }
        double totalAmount = this.amount + paymentAmount;
        this.setAmount(totalAmount);
    }

    public void withdrawalMoney(double withdrawalAmount) {
        double fee = 5;
        if (withdrawalAmount > this.amount) {
            System.out.println("So tien con lai ko du");
        } else {
            double totalAmount = this.amount - withdrawalAmount - fee;
            this.setAmount(totalAmount);
        }
    }
    public void maturity(){
        this.setAmount(this.amount+(this.amount*this.INTERREST));
    }
    public void transferMoney(long bankAccount,double transferAmount){
        this.setAmount(this.amount-transferAmount);

    }

}
