package furamaresort.models;

import java.io.*;
import java.util.*;

public class FileUtils {
    public static void writeVilla(Villa villa) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\villa.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.getId() + "," + villa.getServiceName() + "," + villa.getAreaUse() + "," + villa.getRentalCost() + "," + villa.getMaxPerson() + "," + villa.getRentalForm() + "," + villa.getStandarRoomVilla() + "," + villa.getConvenientOtherVilla() + "," + villa.getAreaPoll() + "," + villa.getNumberFloorVilla() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeHouse(House house) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\house.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(house.getId() + "," + house.getServiceName() + "," + house.getAreaUse() + "," + house.getRentalCost() + "," + house.getMaxPerson() + "," + house.getRentalForm() + "," + house.getStandarRoomHouse() + "," + house.getConvenientOtherHouse() + "," + house.getNumberFloorHouse() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeRoom(Room room) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\room.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room.getId() + "," + room.getServiceName() + "," + room.getAreaUse() + "," + room.getRentalCost() + "," + room.getMaxPerson() + "," + room.getRentalForm() + "," + room.getFreeService() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Villa> getListVilla() {
        List<Villa> villaList = new ArrayList<>();
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\villa.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            Villa villa;
            String line;
            String[] myArray;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                villa = new Villa(myArray[0], myArray[1], Integer.parseInt(myArray[2]), Integer.parseInt(myArray[3]), Integer.parseInt(myArray[4]), myArray[5], myArray[6], myArray[7], Integer.parseInt(myArray[8]), Integer.parseInt(myArray[9]));
                villaList.add(villa);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return villaList;
    }

    public static void readVilla() {
        List<Villa> villaList;
        villaList = getListVilla();
        for (Villa element : villaList) {
            System.out.println(element);
        }
    }

    public static void readVillaNotDuplicateName() {
        TreeSet<Villa> villaList = new TreeSet<>();
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\villa.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            Villa villa;
            String line;
            String[] myArray;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                villa = new Villa(myArray[0], myArray[1], Integer.parseInt(myArray[2]), Integer.parseInt(myArray[3]), Integer.parseInt(myArray[4]), myArray[5], myArray[6], myArray[7], Integer.parseInt(myArray[8]), Integer.parseInt(myArray[9]));
                villaList.add(villa);
            }
            for (Villa element : villaList) {
                System.out.println(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void displayVilla() {
        List<Villa> villaList;
        villaList = getListVilla();
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println((i + 1) + "." + villaList.get(i).getId() + "," + villaList.get(i).getServiceName() + "," + villaList.get(i).getAreaUse() + "," + villaList.get(i).getRentalCost() + "," + villaList.get(i).getMaxPerson() + "," + villaList.get(i).getRentalForm() + "," + villaList.get(i).getStandarRoomVilla() + "," + villaList.get(i).getConvenientOtherVilla() + "," + villaList.get(i).getAreaPoll() + "," + villaList.get(i).getNumberFloorVilla());
        }
    }


    public static Villa choiceVilla(int i) {
        List<Villa> villaList;
        villaList = getListVilla();
        return villaList.get(i);
    }

    public static List<House> getListHouse() {
        List<House> houseList = new ArrayList<>();
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\house.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] myArray;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                house = new House(myArray[0], myArray[1], Integer.parseInt(myArray[2]), Integer.parseInt(myArray[3]), Integer.parseInt(myArray[4]), myArray[5], myArray[6], myArray[7], Integer.parseInt(myArray[8]));
                houseList.add(house);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return houseList;
    }

    public static void readHouseNotDuplicateName() {
        TreeSet<House> houseList = new TreeSet<>();
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\house.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] myArray;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                house = new House(myArray[0], myArray[1], Integer.parseInt(myArray[2]), Integer.parseInt(myArray[3]), Integer.parseInt(myArray[4]), myArray[5], myArray[6], myArray[7], Integer.parseInt(myArray[8]));
                houseList.add(house);
            }
            for (House element : houseList) {
                element.showInfor();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readHouse() {
        List<House> houseList;
        houseList = getListHouse();
        for (House element : houseList) {
            element.showInfor();
        }
    }

    public static void displayHouse() {
        List<House> houseList;
        houseList = getListHouse();
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println((i + 1) + "." + houseList.get(i).getId() + "," + houseList.get(i).getServiceName() + "," + houseList.get(i).getAreaUse() + "," + houseList.get(i).getRentalCost() + "," + houseList.get(i).getMaxPerson() + "," + houseList.get(i).getRentalForm() + "," + houseList.get(i).getStandarRoomHouse() + "," + houseList.get(i).getConvenientOtherHouse() + "," + houseList.get(i).getNumberFloorHouse());
        }
    }

    public static House choiceHouse(int i) {
        List<House> houseList;
        houseList = getListHouse();
        return houseList.get(i);
    }

    public static List<Room> getListRoom() {
        List<Room> roomList = new ArrayList<>();
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\room.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] myArray;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                room = new Room(myArray[0], myArray[1], Integer.parseInt(myArray[2]), Integer.parseInt(myArray[3]), Integer.parseInt(myArray[4]), myArray[5], myArray[6]);
                roomList.add(room);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomList;
    }

    public static void readRoomNotDuplicateName() {
        TreeSet<Room> roomList = new TreeSet<>();
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\room.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] myArray;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                room = new Room(myArray[0], myArray[1], Integer.parseInt(myArray[2]), Integer.parseInt(myArray[3]), Integer.parseInt(myArray[4]), myArray[5], myArray[6]);
                roomList.add(room);
            }
            for (Room element : roomList) {
                element.showInfor();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void readRoom() {
        List<Room> roomList;
        roomList = getListRoom();
        for (Room element : roomList) {
            element.showInfor();
        }
    }

    public static void displayRoom() {
        List<Room> roomList;
        roomList = getListRoom();
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println((i + 1) + "." + roomList.get(0).getId() + "," + roomList.get(0).getServiceName() + "," + roomList.get(0).getAreaUse() + "," + roomList.get(0).getRentalCost() + "," + roomList.get(0).getMaxPerson() + "," + roomList.get(0).getRentalForm() + "," + roomList.get(0).getFreeService());
        }
    }

    public static Room choiceRoom(int i) {
        List<Room> roomList;
        roomList = getListRoom();
        return roomList.get(i);
    }

    public static void writeCustomer(Customer customer) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\customer.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.getName() + "," + customer.getBirthday() + "," + customer.getIdCard() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getCustomerType() + "," + customer.getAddress() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readCustomer() {
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\customer.csv");
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] myArray;
            Customer customer;

            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                customer = new Customer(myArray[0], myArray[1], myArray[2], myArray[3], myArray[4], myArray[5], myArray[6]);
                customerList.add(customer);
            }
            Collections.sort(customerList, new SortCustomer());
            for (Customer element : customerList) {
                element.showInfor();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void displayCustommer() {
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\customer.csv");
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] myArray;
            Customer customer;

            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                customer = new Customer(myArray[0], myArray[1], myArray[2], myArray[3], myArray[4], myArray[5], myArray[6]);
                customerList.add(customer);
            }

            for (int i = 0; i < customerList.size(); i++) {
                System.out.println((i + 1) + "." + customerList.get(i).getName() + "," + customerList.get(i).getBirthday() + "," + customerList.get(i).getIdCard() + "," + customerList.get(i).getPhoneNumber() + "," + customerList.get(i).getEmail() + "," + customerList.get(i).getCustomerType() + "," + customerList.get(i).getAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Customer choiceCustomer(int i) {
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\customer.csv");
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] myArray;
            Customer customer;

            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                customer = new Customer(myArray[0], myArray[1], myArray[2], myArray[3], myArray[4], myArray[5], myArray[6]);
                customerList.add(customer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList.get(i);
    }


    public static void writeBooking(Customer customer) {
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\booking.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.getName() + "," + customer.getBirthday() + "," + customer.getIdCard() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getCustomerType() + "," + customer.getAddress() + "," + customer.getService() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void  displayEmployee(){
        Map<String,Employee> employeeMap = new HashMap<>();
        File file=new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\employee.csv");
        BufferedReader bufferedReader=null;
        try {
            FileReader fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line;
            String [] myArray;
            Employee employee;
            int i=1;
            while ((line=bufferedReader.readLine())!=null){
                String idEmployee="00"+i;
                myArray=line.split(",");
                employee=new Employee(myArray[0],Integer.parseInt(myArray[1]),myArray[2]);
                employeeMap.put(idEmployee,employee);
                i++;
            }
//            Iterator iterator = employeeMap.entrySet().iterator();
//            while (iterator.hasNext()) {
//                Map.Entry element = (Map.Entry) iterator.next();
//                System.out.println("Ma NV: "+element.getKey() + " & Thong tin NV: " + element.getValue());
//            }
            for (Map.Entry<String, Employee> e : employeeMap.entrySet())
                System.out.println(e.getKey() + " "
                        + e.getValue());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Stack<Employee> getEmployee(){
        Stack<Employee> employeeStack=new Stack<>();
        BufferedReader bufferedReader=null;
        Employee employee=null;
        File file=new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\employee.csv");
        try {
            FileReader fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line;
            String [] myArray;

            while ((line=bufferedReader.readLine())!=null){
                myArray=line.split(",");
                employee=new Employee(myArray[0],Integer.parseInt(myArray[1]),myArray[2]);
                employeeStack.push(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     return employeeStack;
    }
    }

