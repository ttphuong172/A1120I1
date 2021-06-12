package controller;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;
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

    ProductServiceImpl productService = new ProductServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action.equals("find")) {
            Integer find = Integer.parseInt(request.getParameter("find"));
            Product product = productService.findById(find);
            request.setAttribute("product", product);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("create")) {
            System.out.println("Da vao");
            Integer id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Integer price = Integer.parseInt(request.getParameter("price"));
            Product product = new Product(id, name, price);
            productService.save(product);
            request.setAttribute("productList", productService.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("update")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Integer price = Integer.parseInt(request.getParameter("price"));
            Product product = new Product(id, name, price);
            productService.update(id, product);
            request.setAttribute("productList", productService.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        System.out.println("Sao vay he "+action);

        if (action == null) {
            request.setAttribute("productList", productService.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("create")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/add.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("update")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            Product product = productService.findById(id);
            request.setAttribute("product", product);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/update.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("delete")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            productService.remove(id);
            request.setAttribute("productList", productService.findAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }

    }
}
