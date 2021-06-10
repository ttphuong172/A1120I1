package controller;

import model.Product;
import servive.ProductService;
import servive.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Customizer;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = {""})
public class ProductServlet extends HttpServlet {

    ProductServiceImpl productList = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if(action.equals("create")){
            System.out.println("Da vao");
            Integer id =Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Integer price =Integer.parseInt(request.getParameter("price"));
            Product product=new Product(id,name,price);
            productList.save(product);
            request.setAttribute("productList", productList.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("update")){
            Integer id =Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Integer price =Integer.parseInt(request.getParameter("price"));
            Product product=new Product(id,name,price);
            productList.update(id, product );
            request.setAttribute("productList", productList.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            request.setAttribute("productList", productList.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("create")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/add.jsp");
            dispatcher.forward(request, response);
        }else if(action.equals("update")){
            Integer id=Integer.parseInt(request.getParameter("id"));
            Product product= productList.findById(id);
            request.setAttribute("product",product);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/update.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("delete")){
            Integer id=Integer.parseInt(request.getParameter("id"));
            productList.remove(id);
            request.setAttribute("productList", productList.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }

    }
}
