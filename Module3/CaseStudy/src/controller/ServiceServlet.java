package controller;

import model.Service;
import repository.RentalFormService;
import repository.RentalFormServiceImpl;
import repository.ServiceRepository;
import service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    ServiceService serviceService = new ServiceServiceImpl();
    ServiceTypeService serviceTypeService = new ServiceTypeServiceImpl();
    RentalFormService rentalFormService = new RentalFormServiceImpl();
    VillaHouseStandardService villaHouseStandardService = new VillaHouseStandardServiceImpl();

    void showService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("serviceList", serviceService.selectAllService());
        request.setAttribute("serviceTypeList", serviceTypeService.selectAllServiceType());
        request.setAttribute("rentalFormList", rentalFormService.selectAllRentalForm());
        request.setAttribute("villaHouseStandardList", villaHouseStandardService.selectAllVillaHouseStandard());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/service/listservice.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Service service = null;
        String action = request.getParameter("action");
        if (action.equals("create")) {
            String serviceId = request.getParameter("serviceid");
            String serviceTypeId = request.getParameter("servicetypeid");
            String serviceName = request.getParameter("servicename");
            int useArea = Integer.parseInt(request.getParameter("usearea"));
            int rentalPrice = Integer.parseInt(request.getParameter("rentalprice"));
            int maxPerson = Integer.parseInt(request.getParameter("maxperson"));
            String rentalFormId = request.getParameter("rentalformid");

            if (serviceTypeId.equals("RO")) {
                String freeServiceRoom = request.getParameter("freeserviceroom");
                service = new Service(serviceId, serviceTypeId, serviceName, useArea, rentalPrice, maxPerson, rentalFormId, freeServiceRoom);
                serviceService.saveRoom(service);
                showService(request, response);
            } else if (serviceTypeId.equals("HO")) {
                String villaHouseStandardId = request.getParameter("villahousestandardid");
                String otherConvenientVillaHouse = request.getParameter("otherconvenientvillahouse");
                int numberFloorVillaHouse = Integer.parseInt(request.getParameter("numberfloorvillahouse"));
                service = new Service(serviceId, serviceTypeId, serviceName, useArea, rentalPrice, maxPerson, rentalFormId, villaHouseStandardId, otherConvenientVillaHouse, numberFloorVillaHouse);
                serviceService.saveHouse(service);
                showService(request, response);
            } else {
                String villaHouseStandardId = request.getParameter("villahousestandardid");
                String otherConvenientVillaHouse = request.getParameter("otherconvenientvillahouse");
                int pollVillaArea = Integer.parseInt(request.getParameter("pollvillaarea"));
                int numberFloorVillaHouse = Integer.parseInt(request.getParameter("numberfloorvillahouse"));
                service = new Service(serviceId, serviceTypeId, serviceName, useArea, rentalPrice, maxPerson, rentalFormId, villaHouseStandardId, otherConvenientVillaHouse, pollVillaArea, numberFloorVillaHouse);
                serviceService.saveVilla(service);
                showService(request, response);
            }
        } else if(action.equals("update")){
            String serviceId = request.getParameter("serviceid");
            String serviceTypeId = request.getParameter("servicetypeid");
            String serviceName = request.getParameter("servicename");
            int useArea = Integer.parseInt(request.getParameter("usearea"));
            int rentalPrice = Integer.parseInt(request.getParameter("rentalprice"));
            int maxPerson = Integer.parseInt(request.getParameter("maxperson"));
            String rentalFormId = request.getParameter("rentalformid");
            if (serviceTypeId.equals("RO")) {
                String freeServiceRoom = request.getParameter("freeserviceroom");
                service = new Service(serviceId, serviceTypeId, serviceName, useArea, rentalPrice, maxPerson, rentalFormId, freeServiceRoom);
                serviceService.updateRoom(serviceId,service);
                showService(request,response);
            } else if(serviceTypeId.equals("HO")){
                String villaHouseStandardId = request.getParameter("villahousestandardid");
                String otherConvenientVillaHouse = request.getParameter("otherconvenientvillahouse");
                System.out.println(otherConvenientVillaHouse);
                int numberFloorVillaHouse = Integer.parseInt(request.getParameter("numberfloorvillahouse"));
                service = new Service(serviceId, serviceTypeId, serviceName, useArea, rentalPrice, maxPerson, rentalFormId, villaHouseStandardId, otherConvenientVillaHouse, numberFloorVillaHouse);
                serviceService.updateHouse(serviceId,service);
                showService(request, response);
            } else{
                System.out.println("Villa");
                String villaHouseStandardId = request.getParameter("villahousestandardid");
                String otherConvenientVillaHouse = request.getParameter("otherconvenientvillahouse");
                int pollVillaArea = Integer.parseInt(request.getParameter("pollvillaarea"));
                int numberFloorVillaHouse = Integer.parseInt(request.getParameter("numberfloorvillahouse"));
                service = new Service(serviceId, serviceTypeId, serviceName, useArea, rentalPrice, maxPerson, rentalFormId, villaHouseStandardId, otherConvenientVillaHouse, pollVillaArea,numberFloorVillaHouse);

            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            showService(request, response);
        } else if (action.equals("create")) {
            request.setAttribute("serviceTypeList", serviceTypeService.selectAllServiceType());
            request.setAttribute("rentalFormList", rentalFormService.selectAllRentalForm());
            request.setAttribute("villaHouseStandardList", villaHouseStandardService.selectAllVillaHouseStandard());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/service/addservice.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("delete")) {
            String serviceId = request.getParameter("id");
            serviceService.remove(serviceId);
            showService(request, response);
        } else if(action.equals("edit")){
            String serviceId=request.getParameter("id");
            request.setAttribute("service",serviceService.findServiceById(serviceId));
            request.setAttribute("serviceTypeList", serviceTypeService.selectAllServiceType());
            request.setAttribute("rentalFormList", rentalFormService.selectAllRentalForm());
            request.setAttribute("villaHouseStandardList", villaHouseStandardService.selectAllVillaHouseStandard());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/service/editservice.jsp");
            dispatcher.forward(request, response);
        }
    }

}
