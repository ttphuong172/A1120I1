package controller;

import common.Check;
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
        String customerId = request.getParameter("customerid");
        String customerName = request.getParameter("namecustomer");
        String birthday = request.getParameter("birthday");
        String idCard =request.getParameter("idcard");
        String phoneNumber = request.getParameter("phonenumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String customerTypeId = request.getParameter("customertype");
        CustomerType customerType = customerTypeService.findCustomerTypeById(customerTypeId);

        Customer customer = new Customer(customerId,customerName, birthday, idCard, phoneNumber, email, customerType, address);
        String msg= customerService.save(customer);
        System.out.println(msg);
        if (msg.equals("Thanh cong")){
            showCustomer(request,response);
        }else{
            request.setAttribute("msg",msg);
            StringBuffer nextCustomerIdString=getnextCustomerId();
            request.setAttribute("customerId",nextCustomerIdString);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/addcustomer.jsp");
            dispatcher.forward(request, response);
        }

    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response){
        String customerId=request.getParameter("idcustomer") ;
        String customerName = request.getParameter("namecustomer");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idcard");
        String phoneNumber = request.getParameter("phonenumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String customerTypeId = request.getParameter("customertype");
        CustomerType customerType=customerTypeService.findCustomerTypeById(customerTypeId);
        Customer customer= new Customer(customerId,customerName,birthday,idCard,phoneNumber,email,customerType,address);
        customerService.update(customerId,customer);
    }
    private StringBuffer getnextCustomerId(){
        StringBuffer nextCustomerIdString=new StringBuffer();
        int  nextCustomerId= customerService.getLastCustomerId()+1 ;
        if  (nextCustomerId<10){
            nextCustomerIdString.append("KH-000");
            nextCustomerIdString.append(nextCustomerId);
        } else if(nextCustomerId<100){
            nextCustomerIdString.append("KH-00");
            nextCustomerIdString.append(nextCustomerId);
        }
        else if(nextCustomerId<1000){
            nextCustomerIdString.append("KH-0");
            nextCustomerIdString.append(nextCustomerId);
        }
        else {
            nextCustomerIdString.append("KH-");
            nextCustomerIdString.append(nextCustomerId);
        }
        return nextCustomerIdString;
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
            String id=request.getParameter("find");
            Customer customer=customerService.findCustomerById(id);
            request.setAttribute("customer",customer);
           showCustomer(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            showCustomer(request, response);
        } else if (action.equals("create")) {
            StringBuffer nextCustomerIdString=getnextCustomerId();
            request.setAttribute("customerId",nextCustomerIdString);
            request.setAttribute("customerTypeList", customerTypeService.selectAllCustomerType());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/addcustomer.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("delete")) {
            String customerid = request.getParameter("id");
            customerService.remove(customerid);
            showCustomer(request, response);
        }else if(action.equals("edit")){
            String customerid=request.getParameter("id");
            request.setAttribute("customer",customerService.findCustomerById(customerid));
            request.setAttribute("customerTypeList",customerTypeService.selectAllCustomerType());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/editcustomer.jsp");
            dispatcher.forward(request, response);
        }

    }
}
