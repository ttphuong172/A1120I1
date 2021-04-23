package furamaresort.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class FileCabinet {
    Stack<Employee> employeeStack=new Stack<>();

    public void addEmployee(Employee employee){
        employeeStack.push(employee);
    }
    public void displayEmployee(){
        // Creating an iterator
        Iterator value = employeeStack.iterator();
        // Displaying the values
        // after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
    public void searchEmployee(String myString){
        List<Employee> employeeList=new ArrayList<>();
        for (int i=0;i<employeeStack.size();i++){
            if( employeeStack.get(i).getName().contains(myString)){
                employeeList.add(employeeStack.get(i));
            }
            else {
            }
        }
        if (employeeList.size()==0){
            System.out.println("Khong tim thay");
        } else {
            for(Employee element:employeeList){
                System.out.println(element);
            }
        }


    }


    }

