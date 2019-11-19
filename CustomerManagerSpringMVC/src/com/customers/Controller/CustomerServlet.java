package com.customers.Controller;

import com.customers.Model.Customer;
import com.customers.Service.CustomerService;
import com.customers.Service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;

@Controller
public class CustomerServlet {
   @Autowired
   CustomerService customerService = new ICustomerService();

    @GetMapping ("/home")
    public String index (Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "home";
    }

    @GetMapping("/formAdd")
    public String showAdd () {
        return "add";
    }

    @PostMapping("/add")
    public String add (@ModelAttribute Customer customer) {
        customerService.add(customer);
//        model.addAttribute("customers", customer);
        return "redirect:/home";

    }


   @GetMapping("/formDelete")
    public String showDelete (int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customers", customer );
        return "delete";
    }

    @PostMapping ("/delete")
    public String delete (int id ) {
        customerService.delete(id);
        return "redirect:/home";
    }


    @GetMapping ("/formUpdate")
    public String showUpdate () {
        return "update";
    }

    @PostMapping ("/update")
    public String update (@ModelAttribute int id, Customer customer) {
        customerService.update(id,customer);
        return "redirect:/home";

    }
}
