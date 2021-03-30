package _07_abstract_interface.homework.bank;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Account> listAccount = new ArrayList<>();

        int choice;
        long bankAccount;
        String accountName;
        double amount;
        Account account;
        do {
            System.out.println("1. Them moi tai khoan");
            System.out.println("2. Hien thi danh sach tai khoan");
            System.out.println("Nhap vao lua chon");
            choice =scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap vao so tai khoan");
                    bankAccount=scanner.nextLong();
                    scanner.skip("\\R");
                    System.out.println("Nhap vao ten tai khoan");
                    accountName=scanner.nextLine();
                    System.out.println("Nhap vao so tien ban dau");
                    amount=scanner.nextDouble();
                    account=new Account(bankAccount,accountName,amount);
                    listAccount.add(account);
                    break;
                case 2:
                    for (Account ds: listAccount){
                        System.out.println(ds.toString());
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice!=0);
    }
}
