import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Float first = Float.parseFloat(request.getParameter("first"));
        String operator = request.getParameter("operator");
        Float second = Float.parseFloat(request.getParameter("second"));
        String error = "";
        String result = "";


        try {
            result = Calculator.calculate(first, second, operator);
        } catch (Exception ex) {
            error = ex.getMessage();
        }

        request.setAttribute("result", result);
        request.setAttribute("error", error);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/calculator.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
