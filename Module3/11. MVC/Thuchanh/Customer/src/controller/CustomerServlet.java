package controller;

import model.Customer;
import repository.CustomerRepositoryImpl;
import service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/add", "/edit", "/find"})
public class CustomerServlet extends HttpServlet {

    CustomerServiceImpl customerList = new CustomerServiceImpl();

    void showCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        showCustomer(request,response);
        System.out.println(action);

        if (action.equals("/add")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            Customer customer = new Customer(id, name, email, address);
            customerList.save(customer);
            showCustomer(request, response);
        } else if (action.equals("/edit")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            Customer customer = new Customer(id, name, email, address);
            customerList.update(id, customer);
            showCustomer(request, response);
        } else if (action.equals("/find")) {
            Integer id = Integer.parseInt(request.getParameter("find"));
            Customer customer=customerList.findById(id);
            request.setAttribute("customer",customer);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
            dispatcher.forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            showCustomer(request, response);
        } else if (action.equals("delete")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            customerList.remove(id);
            showCustomer(request, response);
        } else if (action.equals("edit")) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            Customer customer = customerList.findById(id);
            request.setAttribute("customer", customer);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/edit.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("add")) {
            response.sendRedirect("/customer/add.jsp");
        } else if (action.equals("list")) {
           showCustomer(request,response);
        }
    }
}
