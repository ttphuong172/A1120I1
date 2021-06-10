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

    String calculate(float first, float second, String operator) {
        Float result = 0.0F;
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    throw new RuntimeException("Can not divide 0");
                }
        }
        return first + operator + second + "=" + result;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
        String myError = "";
        Float first = 0.0F;
        Float second = 0.0F;
        if (firstString == "" || secondString == "") {
            myError = "Please enter operand1, operand 2";
            request.setAttribute("myError", myError);
        } else if (!(firstString.matches("[+-]?\\d*(\\.\\d+)?")) ) {
            myError = "First operand 1 is not number";
            request.setAttribute("myError", myError);
        } else if( !(secondString.matches("[+-]?\\d*(\\.\\d+)?"))) {
            myError = "First operand 2 is not number";

            request.setAttribute("myError", myError);
        }
        else {
            first = Float.parseFloat(request.getParameter("first"));
            second = Float.parseFloat(request.getParameter("second"));
        }
        String operator = request.getParameter("operator");
        String result = "";
        try {
            result = calculate(first, second, operator);
        } catch (Exception ex) {
            myError = ex.getMessage();
        }

        request.setAttribute("result", result);

        RequestDispatcher dispatcher;
        if (myError=="") {
             dispatcher = request.getRequestDispatcher("/calculator.jsp");
        } else{
            request.setAttribute("myError", myError);
             dispatcher = request.getRequestDispatcher("/index.jsp");
        }
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
