package controller;

import model.Employee;
import model.Login;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.LoginService;
import service.LoginServiceImpl;
import sun.plugin.com.Dispatcher;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "")
public class LoginServlet extends HttpServlet {
    LoginService loginService=new LoginServiceImpl();
    EmployeeService employeeService=new EmployeeServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

      if (action.equals("login")){
          String username=request.getParameter("username");
          String password=request.getParameter("password");
          int employeeId=loginService.getEmployeeId(username,password);
          if (employeeId!=0){
              Employee employee=employeeService.findEmployeeById(employeeId);
              Login login=new Login(username,password,employee);

              HttpSession session= request.getSession();
              session.setAttribute("login",login);
              response.sendRedirect("/contract");
          } else{
              RequestDispatcher dispatcher=request.getRequestDispatcher("/login.jsp");
              dispatcher.forward(request,response);
          }
      }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request,response);
    }
}
