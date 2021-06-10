import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmailServlet",urlPatterns = "/emaillist")
public class EmailServlet extends HttpServlet {

    List<User> userList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String email=request.getParameter("email");
        String firstName=request.getParameter("firstname");
        String lastName=request.getParameter("lastname");

        userList.add(new User(email,firstName,lastName));
        request.setAttribute("userList",userList);
        String message;
        if(email==null|| email.isEmpty()||firstName==null|| firstName.isEmpty()||lastName==null|| lastName.isEmpty()){
            message="Please fill out all three textboxes";
            request.setAttribute("message",message);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request,response);

        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/emaillist.jsp");
            dispatcher.forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
