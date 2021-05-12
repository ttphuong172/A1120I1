package furamaresort.models;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class FileCabinet {
    Stack<Employee> employeeStack = new Stack<>();


    public void getEmployee() {
        BufferedReader bufferedReader = null;
        Employee employee = null;
        File file = new File("C:\\Users\\phuongtt\\Desktop\\A1120I1-TranThanhPhuong\\Module2\\src\\furamaresort\\data\\employee.csv");
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] myArray;
            while ((line = bufferedReader.readLine()) != null) {
                myArray = line.split(",");
                employee = new Employee(myArray[0], Integer.parseInt(myArray[1]), myArray[2]);
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
    }

    public void searchEmployee(String myString) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < employeeStack.size(); i++) {
            if (employeeStack.get(i).getName().contains(myString)) {
                employeeList.add(employeeStack.get(i));
            } else {
            }
        }
        if (employeeList.size() == 0) {
            System.out.println("Khong tim thay");
        } else {
            for (Employee element : employeeList) {
                System.out.println(element);
            }
        }
    }
}

