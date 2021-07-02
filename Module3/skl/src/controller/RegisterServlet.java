package controller;

import repository.ClassesRepository;
import repository.ClassesRepositoryImpl;
import repository.StudentRepository;
import repository.StudentRepositoryImpl;
import sun.plugin.com.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentServlet",urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    StudentRepository studentRepository=new StudentRepositoryImpl();
    ClassesRepository classesRepository=new ClassesRepositoryImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action.equals("search")){
            String classId=request.getParameter("classesid");
            System.out.println(classId);
            request.setAttribute("listStudent",studentRepository.selectStudentByClass(classId));
            request.setAttribute("listClasses",classesRepository.selectAllClass());
            RequestDispatcher dispatcher=request.getRequestDispatcher("/register/list.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null) {
            request.setAttribute("listClasses", classesRepository.selectAllClass());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/register/list.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("dangky")){
            String studentId=request.getParameter("id");
            System.out.println(studentId);
            request.setAttribute("student",studentRepository.findStudentById(studentId));
            RequestDispatcher dispatcher = request.getRequestDispatcher("/register/regis.jsp");
            dispatcher.forward(request, response);
        }
    }
}
