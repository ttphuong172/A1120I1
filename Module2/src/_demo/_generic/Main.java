package _demo._generic;

// A Class that represents use-defined expception

import java.util.Scanner;

public class Main
{
    // Driver Program
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        do{
            try
            {
                System.out.println("Nhap i lon hon 0 , nho hon 20");
                i=scanner.nextInt();
                // Throw an object of user defined exception

                if (i>20)  throw new MyException();
            }
            catch (MyException ex)
            {
                //System.out.println("Caught");

                // Print the message from MyException object
                //System.out.println(ex.getMessage());
            }
        } while (i>20);

    }
}
