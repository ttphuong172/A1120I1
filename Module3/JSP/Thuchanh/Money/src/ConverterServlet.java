import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FilePermission;
import java.io.IOException;

@WebServlet(name = "ConverterServlet",urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float rate = Float.parseFloat(request.getParameter("rate"));
        Float usd=Float.parseFloat(request.getParameter("usd"));
        Float vnd=rate*usd;

        request.setAttribute("vnd",vnd);
        request.setAttribute("rate",rate);
        request.setAttribute("usd",usd);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/converter.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
