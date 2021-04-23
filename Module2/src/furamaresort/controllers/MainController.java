package furamaresort.controllers;

import furamaresort.models.*;


import java.util.Scanner;

import static furamaresort.models.Check.*;
import static furamaresort.models.Check.checkIdVilla;
import static furamaresort.models.FileUtils.*;


public class MainController {
    public static void displaymainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Customer");
        System.out.println("4. Booking");
        System.out.println("5. Display All Furama's Employee");
        System.out.println("6. Buy Ticket Cinema");
        System.out.println("7. Search Employee");

        int choice;
        Services services;
        Customer customer;
        //Info common
        String id = null;
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

        //Infor Customer
        String name = null;
        String birthday;
        String idCard = null;
        String phoneNumber;
        String email = null;
        String customerType;
        String address;
        //Quan ly ve
        CinemaManager cinemaManager = new CinemaManager();
        FileCabinet fileCabinet=new FileCabinet();
        for (int i=0;i<getEmployee().size();i++){
            fileCabinet.addEmployee(getEmployee().get(i));
        }

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
                            if (subchoice == 1) {
                                do {
                                    System.out.print("Nhap id:");
                                    id = scanner.nextLine();
                                } while (!checkIdVilla(id));
                            } else if (subchoice == 2) {
                                do {
                                    System.out.print("Nhap id:");
                                    id = scanner.nextLine();
                                } while (!checkIdHouse(id));
                            } else {
                                do {
                                    System.out.print("Nhap id:");
                                    id = scanner.nextLine();
                                } while (!checkIdRoom(id));
                            }
                            System.out.print("Nhap ten dich vu : ");
                            serviceName = scanner.nextLine();
                            do {
                                System.out.print("Dien tich su dung:");
                                areaUse = scanner.nextInt();
                                System.out.println(checkArea(Integer.toString(areaUse)));
                            } while (checkArea(Integer.toString(areaUse)));

                            do {
                                System.out.print("Chi phi thue: ");
                                rentalCost = scanner.nextInt();
                            } while (!checkRentalCost(Integer.toString(rentalCost)));
                            do {
                                System.out.print("So nguoi toi da:");
                                maxPerson = scanner.nextInt();
                            } while (!checkMaxPerson(maxPerson));
                            scanner.nextLine();
                            System.out.print("Kieu thue (ngay, thang, nam): ");
                            rentalForm = scanner.nextLine();
                            if (subchoice == 1) {
                                //serviceName = "Villa";
                                System.out.print("Nhap tieu chuan phong (Vip, Business, Normal): ");
                                standarRoomVilla = scanner.nextLine();
                                System.out.print("Tien nghi khac: ");
                                convenientOtherVilla = scanner.nextLine();
                                do {
                                    System.out.print("Dien tich ho boi: ");
                                    areaPoll = scanner.nextInt();
                                } while (!checkArea("areaPoll"));
                                System.out.print("So tang: ");
                                numberFloorVilla = scanner.nextInt();
                                services = new Villa(id, serviceName, areaUse, rentalCost, maxPerson, rentalForm, standarRoomVilla, convenientOtherVilla, areaPoll, numberFloorVilla);
                                //Phục vụ ghi file
                                Villa villa = (Villa) services;
                                writeVilla(villa);
                            } else if (subchoice == 2) {
                                //serviceName = "House";
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
                                //serviceName = "Room";
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
                        } else if (subchoice == 4) {
                            readVillaNotDuplicateName();
                        } else if (subchoice == 5) {
                            readHouseNotDuplicateName();
                        } else if (subchoice == 6) {
                            readRoomNotDuplicateName();
                        } else if (subchoice == 7) {
                            break;
                        } else if (subchoice == 8) {
                            System.exit(0);
                        }
                    } while (true);
                    break;
                case 3:
                    do {
                        System.out.println("1. Add Customer ");
                        System.out.println("2. Show All Customer ");
                        System.out.println("3. Back to menu");
                        System.out.println("4. Exit");
                        System.out.print("Enter sub choice: ");
                        int subchoice = scanner.nextInt();
                        scanner.nextLine();
                        if (subchoice == 1) {
                            do {
                                try {
                                    System.out.print("Nhap ten khach hang: ");
                                    name = scanner.nextLine();
                                    if (!checkNameException(name)) throw new NameException();
                                } catch (NameException e) {

                                }
                            } while (!checkNameException(name));

                            System.out.print("Nhap ngay sinh:");
                            birthday = scanner.nextLine();
                            do {
                                try {
                                    System.out.print("Nhap CMND: ");
                                    idCard = scanner.nextLine();
                                    if (!checkIdCardException(idCard)) throw new IdCardException();
                                } catch (IdCardException e) {

                                }
                            } while (!checkIdCardException(idCard));

                            System.out.print("Nhap so dien thoai");
                            phoneNumber = scanner.nextLine();
                            do {
                                try {
                                    System.out.print("Nhap email: ");
                                    email = scanner.nextLine();
                                    if (!checkEmailException(email)) throw new EmailException();
                                } catch (EmailException e) {
                                }
                            } while (!checkEmailException(email));
                            System.out.print("Nhap loai khach hang: ");
                            customerType = scanner.nextLine();
                            System.out.println("Nhap dia chi: ");
                            address = scanner.nextLine();
                            customer = new Customer(name, birthday, idCard, phoneNumber, email, customerType, address);
                            writeCustomer(customer);
                        } else if (subchoice == 2) {
                            readCustomer();
                        } else if (choice == 3) {
                            break;
                        } else {
                            System.exit(0);
                        }
                    } while (true);
                    break;
                case 4:
                    do {
                        System.out.println("1. Add New Book");
                        System.out.println("2. Back to menu");
                        System.out.println("3. Exit");
                        System.out.print("Enter sub choice: ");
                        int subchoice = scanner.nextInt();
                        scanner.nextLine();
                        if (subchoice == 1) {
                            displayCustommer();
                            System.out.print("Chon Customer: ");
                            int choiceCustomer = scanner.nextInt();
                            Customer customerBooking = choiceCustomer(choiceCustomer - 1);
                            System.out.println(customerBooking);
                            do {
                                System.out.println("1. Booking Villa");
                                System.out.println("2. Booking House");
                                System.out.println("3. Booking Room");
                                System.out.println("4. Back to menu");
                                System.out.println("5. Exit");
                                System.out.println("Enter children choice");
                                int childrenchoice = scanner.nextInt();
                                if (childrenchoice == 1) {
                                    displayVilla();
                                    System.out.print("Chon Villa: ");
                                    int choiceVilla = scanner.nextInt();
                                    Villa villaBooking = choiceVilla(choiceVilla - 1);
                                    System.out.println(villaBooking);
                                    customerBooking.setService(villaBooking);
                                    System.out.println(customerBooking);
                                    writeBooking(customerBooking);
                                    break;
                                } else if (childrenchoice == 2) {
                                    displayHouse();
                                    System.out.print("Chon House: ");
                                    int choiceHouse = scanner.nextInt();
                                    House houseBooking = choiceHouse(choiceHouse - 1);
                                    System.out.println(houseBooking);
                                    customerBooking.setService(houseBooking);
                                    writeBooking(customerBooking);
                                    break;
                                } else if (childrenchoice == 3) {
                                    displayRoom();
                                    System.out.print("Chon Room: ");
                                    int choiceRoom = scanner.nextInt();
                                    Room roomBooking = choiceRoom(choiceRoom - 1);
                                    System.out.println(roomBooking);
                                    customerBooking.setService(roomBooking);
                                    writeBooking(customerBooking);
                                } else if (childrenchoice == 4) {
                                    break;
                                } else {
                                    System.exit(0);
                                }
                            } while (true);
                        } else if (subchoice == 2) {
                            break;
                        } else {
                            System.exit(0);
                        }
                    } while (true);
                case 5:
                    displayEmployee();
                    break;
                case 6:
                    displayCustommer();
                    int veKhaDung = cinemaManager.checkTicket();

                    System.out.println("So ve kha dung: " + cinemaManager.checkTicket());
                    System.out.print("Chon khach mua:");
                    int choiceCustomer = scanner.nextInt();
                    String nameCinema = choiceCustomer(choiceCustomer - 1).getName();
                    System.out.print("So luong ve: ");
                    int amoutTicket = scanner.nextInt();
                    if (amoutTicket <= veKhaDung) {
                        cinemaManager.addTicket(nameCinema, amoutTicket);
                    } else {
                        System.out.println("So luong ve ko du de ban");
                    }
                    if (cinemaManager.checkTicket() == 0) {
                        cinemaManager.displayTicket();
                    }
                    break;
                case 7:
                    System.out.print("Nhap vao ten can tim: ");
                    scanner.nextLine();
                    String nameEmployee=scanner.nextLine();
                    fileCabinet.searchEmployee(nameEmployee);
            }
        } while (true);
    }

    public static void main(String[] args) {
        displaymainMenu();
    }
}
