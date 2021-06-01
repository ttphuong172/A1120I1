import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String productDescripton = request.getParameter("productdescription");
        Float listPrice = Float.parseFloat(request.getParameter("listprice"));
        Float discountPercent=Float.parseFloat(request.getParameter("discountpercent"));

        double discountAmout=listPrice*discountPercent*0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description: "+productDescripton+"</h1>");
        writer.println("<h1> List Price: "+listPrice+"</h1>");
        writer.println("<h1> Discount Percent: "+discountPercent+"</h1>");
        writer.println("<h1> Discount Amount: "+discountAmout+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
