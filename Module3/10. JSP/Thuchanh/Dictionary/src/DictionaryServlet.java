import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet",urlPatterns = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       Map<String,String> dictionaryMap=new HashMap<>();
        dictionaryMap.put("hello","xin chào");
        dictionaryMap.put("bye","tạm biệt");
        dictionaryMap.put("love","yêu");
        dictionaryMap.put("fun","vui");
        dictionaryMap.put("sad","buồn");
        String search=request.getParameter("search");
        String result =dictionaryMap.get(search);

        request.setAttribute("search",search);
        request.setAttribute("result",result);

        RequestDispatcher dispatcher=request.getRequestDispatcher("/dictionary.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
