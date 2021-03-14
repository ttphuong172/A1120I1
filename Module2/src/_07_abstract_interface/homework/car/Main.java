package _07_abstract_interface.homework.car;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> listCar=new ArrayList<>();
        Vehicle vehicle;
        double value;
        int volume;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Tao cac doi tuong xe va nhap thong tin");
            System.out.println("2. Xuat bang ke khai tien thue cua cac xe");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap vao gia tri xe (trieu dong)");
                    value = scanner.nextDouble();
                    System.out.println("Nhap vao dung tich xy lanh cua xe (phan khoi)");
                    volume = scanner.nextInt();
                    vehicle = new Vehicle(value, volume);
                    listCar.add(vehicle);
                    break;
                case 2:
                    for (int i = 0; i < listCar.size(); i++) {
                        listCar.get(i).showCar();
                    }
                    break;

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
