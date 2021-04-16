package furamaresort.controllers;

import furamaresort.models.House;
import furamaresort.models.Room;
import furamaresort.models.Services;
import furamaresort.models.Villa;

import java.util.Scanner;

import static furamaresort.models.Check.*;
import static furamaresort.models.FileUtils.*;

public class MainController {
    public static void displaymainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Add New Services");
        System.out.println("2. Show Services");
        int choice;
        //Info common
        String id;
        String serviceName;
        int areaUse;
        int rentalCost;
        int maxPerson;
        String rentalForm;
        //Info Villa
        String standarRoomVilla;
        String convenientOtherVilla;
        int areaPoll;
        int numberFloorVilla;
        //Info House
        String standarRoomHouse;
        String convenientOtherHouse;
        int numberFloorHouse;
        //Info Room
        String freeService;
        Services services;
        do {
            System.out.print("Enter parent choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.print("1. Add New Villa");
                        System.out.print("2. Add New House");
                        System.out.print("3. Add New Roome");
                        System.out.print("4. Back to menu");
                        System.out.println("5. Exit");
                        System.out.print("Enter sub choice: ");
                        int subchoice = scanner.nextInt();
                        scanner.nextLine();
                        if (subchoice == 1 || subchoice == 2 || subchoice == 3) {
                            System.out.print("Nhap id:");
                            id = scanner.nextLine();
                            //System.out.print("Nhap ten dich vu (Villa, House, Room): ");
                            //serviceName = scanner.nextLine();
                            do {
                                System.out.print("Dien tich su dung:");
                                areaUse = scanner.nextInt();
                            } while (!checkArea(areaUse));

                            do{
                                System.out.print("Chi phi thue: ");
                                rentalCost = scanner.nextInt();
                            } while (!checkRentalCost(rentalCost));
                            do {
                                System.out.print("So nguoi toi da:");
                                maxPerson = scanner.nextInt();
                            } while (!checkMaxPerson(maxPerson));

                            scanner.nextLine();
                            System.out.print("Kieu thue (ngay, thang, nam): ");
                            rentalForm = scanner.nextLine();
                            if (subchoice == 1) {
                                serviceName = "Villa";
                                System.out.print("Nhap tieu chuan phong (Vip, Business, Normal): ");
                                standarRoomVilla = scanner.nextLine();
                                System.out.print("Tien nghi khac: ");
                                convenientOtherVilla = scanner.nextLine();
                                do{
                                    System.out.print("Dien tich ho boi: ");
                                    areaPoll = scanner.nextInt();
                                } while (!checkArea(areaPoll));

                                System.out.print("So tang: ");
                                numberFloorVilla = scanner.nextInt();
                                services = new Villa(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm, standarRoomVilla, convenientOtherVilla, areaPoll, numberFloorVilla);
                                //Phục vụ ghi file
                                Villa villa = (Villa) services;
                                writeVilla(villa);
                            } else if (subchoice == 2) {
                                serviceName = "House";
                                System.out.print("Nhap tieu chuan phong (Vip, Business, Normal): ");
                                standarRoomHouse = scanner.nextLine();
                                System.out.print("Tien nghi khac");
                                convenientOtherHouse = scanner.nextLine();
                                System.out.print("So tang: ");
                                numberFloorHouse = scanner.nextInt();
                                services = new House(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm, standarRoomHouse, convenientOtherHouse, numberFloorHouse);
                                //Phuc vu ghi file
                                House house = (House) services;
                                writeHouse(house);
                            } else {
                                serviceName = "Room";
                                System.out.print("Dich vu mien phi: ");
                                freeService = scanner.nextLine();
                                services = new Room(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm, freeService);
                                //Phuc vu ghi file
                                Room room = (Room) services;
                                writeRoom(room);
                            }
                        } else if (subchoice == 4) {
                            break;
                        } else if (subchoice == 5) {
                            System.exit(0);
                        }
                    } while (true);
                    break;
                case 2:
                    do {
                        System.out.print("1. Show All Villa");
                        System.out.print("2. Show All House");
                        System.out.print("3. Show All Room");
                        System.out.print("4. Show All Name Villa Not Duplicate");
                        System.out.print("5. Show All Name House Not Duplicate");
                        System.out.print("6. Show All Name Room Not Duplicate");
                        System.out.print("7. Back to menu");
                        System.out.println("8. Exit");
                        System.out.print("Enter sub choice: ");
                        int subchoice = scanner.nextInt();
                        scanner.nextLine();
                        if (subchoice == 1) {
                            readVilla();
                        } else if (subchoice == 2) {
                            readHouse();
                        } else if (subchoice == 3) {
                            readRoom();
                        } else if (subchoice == 7) {
                            break;
                        } else if (subchoice == 8) {
                            System.exit(0);
                        }
                    } while (true);
            }
        } while (true);
    }

    public static void main(String[] args) {
        displaymainMenu();
    }
}
