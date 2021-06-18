package controller;

import model.Product;
import model.ProductType;
import servive.ProductService;
import servive.ProductServiceImpl;
import servive.ProductTypeService;
import servive.ProductTypeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = {"","/find"})
public class ProductServlet extends HttpServlet {

        ProductService productService = new ProductServiceImpl();
        ProductTypeService productTypeService=new ProductTypeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equals("find")){
            Integer find =Integer.parseInt(request.getParameter("find"));
            request.setAttribute("product",productService.findById(find));
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("create")){
            System.out.println("Da vao");
            Integer id =Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Integer price =Integer.parseInt(request.getParameter("price"));
            Integer productTypeId =Integer.parseInt(request.getParameter("type"));
            ProductType productType = productTypeService.findProductTypeById(productTypeId);
            Product product=new Product(id,name,price,productType);
            String message=productService.save(product);

            request.setAttribute("productList", productService.selectAllProduct());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("update")){
            Integer id =Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Integer price =Integer.parseInt(request.getParameter("price"));
            Integer productTypeId =Integer.parseInt(request.getParameter("type"));
            ProductType productType = productTypeService.findProductTypeById(productTypeId);
            Product product=new Product(id,name,price,productType);
            productService.update(id, product );
            request.setAttribute("productList", productService.selectAllProduct());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            request.setAttribute("productList", productService.selectAllProduct());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }  else if (action.equals("create")) {
            request.setAttribute("productTypeList",productTypeService.selectAllProductType());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/add.jsp");
            dispatcher.forward(request, response);
        }else if(action.equals("update")) {
            Integer id=Integer.parseInt(request.getParameter("id"));
            Product product= productService.findById(id);
            request.setAttribute("product",product);
            request.setAttribute("productTypeList",productTypeService.selectAllProductType());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/update.jsp");
            dispatcher.forward(request, response);
        } else if(action.equals("delete")){
            Integer id=Integer.parseInt(request.getParameter("id"));
            productService.remove(id);
            request.setAttribute("productList", productService.selectAllProduct());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
            dispatcher.forward(request, response);
        }
    }
}


