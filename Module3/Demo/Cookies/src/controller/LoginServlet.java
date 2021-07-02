package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if(username.equals("admin") && password.equals("admin")){
            Cookie cookie=new Cookie("username",username);
            cookie.setMaxAge(30);
            response.addCookie(cookie);
            response.sendRedirect("/welcome");
        }
        else {
            RequestDispatcher dispatcher =request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher =request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request,response);
    }
}
