package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String remember=request.getParameter("remember");

        if(username.equals("admin") && password.equals("admin")){
            //Save session
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            //Save cookies
            Cookie cookieUsername=new Cookie("username",username);
            Cookie cookiePassword=new Cookie("password",password);
            Cookie cookieRemember=new Cookie("remember",remember);

            response.addCookie(cookieUsername);
            response.addCookie(cookiePassword);
            response.addCookie(cookieRemember);

            //Redirect to welcome
            response.sendRedirect("/welcome");

//            Cookie cookie=new Cookie("username",username);
//            cookie.setMaxAge(30);
//            response.addCookie(cookie);
//            response.sendRedirect("/welcome");
        }
        else {
            RequestDispatcher dispatcher =request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies=request.getCookies();
        request.setAttribute("cookies",cookies);
        RequestDispatcher dispatcher =request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request,response);
    }
}
