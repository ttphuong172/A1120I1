package controller;

import model.Customer;
import model.CustomerType;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.CustomerTypeService;
import service.CustomerTypeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerName = request.getParameter("namecustomer");
        String birthday = request.getParameter("birthday");
        int idCard = Integer.parseInt(request.getParameter("idcard"));
        int phoneNumber = Integer.parseInt(request.getParameter("phonenumber"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String customerTypeId = request.getParameter("customertype");
        //CustomerType customerType = customerTypeService.findCustomerTypeById(customerTypeId);
        Customer customer = new Customer(customerName, birthday, idCard, phoneNumber, email, customerTypeId, address);
        customerService.save(customer);
    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response){
        int customerId=Integer.parseInt(request.getParameter("idcustomer")) ;
        String customerName = request.getParameter("namecustomer");
        String birthday = request.getParameter("birthday");
        int idCard = Integer.parseInt(request.getParameter("idcard"));
        int phoneNumber = Integer.parseInt(request.getParameter("phonenumber"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String customerTypeId = request.getParameter("customertype");
        //CustomerType customerType=customerTypeService.findCustomerTypeById(customerTypeId);
        Customer customer= new Customer(customerId,customerName,birthday,idCard,phoneNumber,email,customerTypeId,address);
        customerService.update(customerId,customer);
    }
    private void showCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerService.selectAllCustomer());
        request.setAttribute("customerTypeList", customerTypeService.selectAllCustomerType());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/listcustomer.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action.equals("create")) {
            createCustomer(request, response);
            showCustomer(request,response);
        } else if(action.equals("edit")){
            updateCustomer(request,response);
            showCustomer(request,response);
        } else if(action.equals("find")){
            int id=Integer.parseInt(request.getParameter("find"));
            Customer customer=customerService.findCustomerById(id);
            request.setAttribute("customer",customer);
           showCustomer(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null) {
            showCustomer(request, response);
        } else if (action.equals("create")) {
            request.setAttribute("customerTypeList", customerTypeService.selectAllCustomerType());
            System.out.println(customerTypeService.selectAllCustomerType());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/addcustomer.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("delete")) {
            int customerid = Integer.parseInt(request.getParameter("id"));
            customerService.remove(customerid);
            showCustomer(request, response);
        }else if(action.equals("edit")){
            int customerid=Integer.parseInt(request.getParameter("id"));
            request.setAttribute("customer",customerService.findCustomerById(customerid));
            request.setAttribute("customerTypeList",customerTypeService.selectAllCustomerType());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/editcustomer.jsp");
            dispatcher.forward(request, response);
        }

    }
}
