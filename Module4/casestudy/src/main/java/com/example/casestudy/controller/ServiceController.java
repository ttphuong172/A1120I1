package com.example.casestudy.controller;

import com.example.casestudy.model.RentType;
import com.example.casestudy.model.Service;
import com.example.casestudy.service.RentTypeService;
import com.example.casestudy.service.ServiceService;
import com.example.casestudy.service.ServiceTypeService;
import com.example.casestudy.service.StandardRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private ServiceTypeService serviceTypeService;
    @Autowired
    private RentTypeService rentTypeService;
    @Autowired
    private StandardRoomService standardRoomService;

    @GetMapping("")
    public String listService(@RequestParam (defaultValue = "0") int page, Model model){
        model.addAttribute("serviceTypeList",serviceTypeService.selectAllServiceType());
        model.addAttribute("rentTypeList",rentTypeService.selectAllRentType());
        model.addAttribute("serviceList",serviceService.selectAllService(PageRequest.of(page,2)));
        return "service/list";
    }
    @GetMapping("create")
    public String createService(Model model){
        model.addAttribute("service", new Service());
        model.addAttribute("serviceTypeList",serviceTypeService.selectAllServiceType());
        model.addAttribute("rentTypeList",rentTypeService.selectAllRentType());
        model.addAttribute("standardRoomList",standardRoomService.selectAllStandardRoom());
        return "service/create";
    }
    @PostMapping("save")
    public String saveService(Service service,RedirectAttributes redirectAttributes){
        serviceService.saveService(service);
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        String url="http://localhost:8080/service/search?nameservice=" + service.getServiceName();
//        return "redirect:";
        return "redirect:" + url;
    }
    @GetMapping("edit/{serviceId}")
    public String editService(@PathVariable int serviceId, Model model){
        model.addAttribute("service",serviceService.findServiceById(serviceId));
        model.addAttribute("serviceTypeList",serviceTypeService.selectAllServiceType());
        model.addAttribute("rentTypeList",rentTypeService.selectAllRentType());
        model.addAttribute("standardRoomList",standardRoomService.selectAllStandardRoom());
        return "service/edit";
    }
    @PostMapping("update")
    public String updateService(Service service, RedirectAttributes redirectAttributes){
        serviceService.saveService(service);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        String url="http://localhost:8080/service/search?nameservice=" + service.getServiceName();
//        return "redirect:/service";
        return "redirect:" + url;
    }
    @GetMapping("search")
    public String searchService(@RequestParam (defaultValue = "0") int page,String nameservice, Optional<Integer> idrenttype,Optional<Integer> idservicetype,Model model){
        model.addAttribute("nameservice",nameservice);
        model.addAttribute("idrenttype",idrenttype.orElse(null));
        model.addAttribute("idservicetype",idservicetype.orElse(null));
        model.addAttribute("serviceTypeList",serviceTypeService.selectAllServiceType());
        model.addAttribute("rentTypeList",rentTypeService.selectAllRentType());
        model.addAttribute("serviceSearchList",serviceService.findByServiceNameContainingAndRentType_RentTypeIdAndServiceType_ServiceTypeId(PageRequest.of(page,2),nameservice,idrenttype,idservicetype));
        return "service/list";
    }
    @GetMapping("delete/{serviceId}")
    public String deleteServive(@PathVariable int serviceId){
        Service service=serviceService.findServiceById(serviceId);
        serviceService.deleteService(service);
        return "redirect:/service";
    }
    @GetMapping("detail/{serviceId}")
    public String detailService(@PathVariable int serviceId, Model model){
        model.addAttribute("service",serviceService.findServiceById(serviceId));
        return "service/detail";
    }
}
