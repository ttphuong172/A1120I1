package furamaresort.models;

import _11_java_collection_framework._hokhau.HoGiaDinh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void readVilla() {
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
            for (Villa element : villaList) {
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

    public static void readRoom() {
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

}