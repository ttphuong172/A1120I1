package _05_access_modifier.th.static_method;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(1,"Thanh Lam");
        Student student2=new Student(2,"Khanh Han");

        student1.display();
        student2.display();

        Student.change();

        student1.display();
        student2.display();
    }
}
