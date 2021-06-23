package controller;

import model.Department;
import model.Diploma;
import model.Employee;
import model.Level;
import service.*;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService=new EmployeeServiceImpl();
    LevelService levelService=new LevelServiceImpl();
    DepartmentService departmentService=new DepartmentServiceImpl();
    DiplomaService diplomaService=new DiplomaServiceImpl();
    void showEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("employeeList",employeeService.selectAllemployee());
        request.setAttribute("levelList",levelService.selectAllLevel());
        request.setAttribute("departmentList",departmentService.selectAllDepartment());
        request.setAttribute("diplomaList",diplomaService.selectAllDiploma());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/listemployee.jsp");
        dispatcher.forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action.equals("create")){
            String name= request.getParameter("nameemployee");
            String birthday=request.getParameter("birthday");
            int idCard=Integer.parseInt(request.getParameter("idcard"));
            int phoneNumber=Integer.parseInt(request.getParameter("phonenumber"));
            String email=request.getParameter("email");
            String levelId=request.getParameter("level");
            Level level=levelService.findLevelById(levelId);
            String departmentId=request.getParameter("department");
            Department department= departmentService.findDepartmentById(departmentId);
            String diplomaId=request.getParameter("diploma");
            Diploma diploma=diplomaService.findDiplomaById(diplomaId);
            int salary=Integer.parseInt(request.getParameter("salary"));
            String address=request.getParameter("address");
            Employee employee=new Employee(name,birthday,idCard,phoneNumber,email,level,department,diploma,salary,address);
            employeeService.save(employee);
            showEmployee(request,response);
        } else if (action.equals("update")){
            int employeeId=Integer.parseInt(request.getParameter("employeeid"));
            String name=request.getParameter("name");
            String birthday=request.getParameter("birthday");
            int cardId=Integer.parseInt(request.getParameter("idcard"));
            int phoneNumber= Integer.parseInt(request.getParameter("phonenumber"));
            String email=request.getParameter("email");
            String levelId=request.getParameter("level");
            Level level=levelService.findLevelById(levelId);
            String departmentId=request.getParameter("department");
            Department department=departmentService.findDepartmentById(departmentId);
            String diplomaId=request.getParameter("diploma");
            Diploma diploma =diplomaService.findDiplomaById(diplomaId);
            int salary=Integer.parseInt(request.getParameter("salary"));
            String address=request.getParameter("address");
            Employee employee=new Employee(employeeId,name,birthday,cardId,phoneNumber,email,level,department,diploma,salary,address);
            employeeService.update(employeeId,employee);
            showEmployee(request,response);
        } else if(action.equals("find")){
            System.out.println("Da vao");
            int employeeId=Integer.parseInt(request.getParameter("find"));
            Employee employee=employeeService.findEmployeeById(employeeId);
            request.setAttribute("employee",employee);
            showEmployee(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            request.setAttribute("employeeList",employeeService.selectAllemployee());
            request.setAttribute("levelList",levelService.selectAllLevel());
            request.setAttribute("departmentList",departmentService.selectAllDepartment());
            request.setAttribute("diplomaList",diplomaService.selectAllDiploma());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/listemployee.jsp");
            dispatcher.forward(request,response);
        } else if(action.equals("create")){
            request.setAttribute("levelList",levelService.selectAllLevel());
            request.setAttribute("departmentList",departmentService.selectAllDepartment());
            request.setAttribute("diplomaList",diplomaService.selectAllDiploma());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/addemployee.jsp");
            dispatcher.forward(request,response);
        }
        else  if (action.equals("update")){
            int employeeId=Integer.parseInt(request.getParameter("id"));
            request.setAttribute("levelList",levelService.selectAllLevel());
            request.setAttribute("departmentList",departmentService.selectAllDepartment());
            request.setAttribute("diplomaList",diplomaService.selectAllDiploma());
            //Xu ly cho nay load du lieu qua nang. Nhieu cai tim long nhau.
            Employee employee=employeeService.findEmployeeById(employeeId);
            request.setAttribute("employee",employee);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/employee/editemployee.jsp");
            dispatcher.forward(request,response);
        } else if(action.equals("delete")){
            int employeeId=Integer.parseInt(request.getParameter("id"));
            employeeService.remove(employeeId);
            showEmployee(request,response);
        }
    }
}
