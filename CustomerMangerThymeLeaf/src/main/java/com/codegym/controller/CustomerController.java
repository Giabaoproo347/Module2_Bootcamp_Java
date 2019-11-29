package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerService customerService = new ICustomerService();

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "home";
    }

    @GetMapping ("/customer/create")
    public String create (Model model) {
        model.addAttribute("customers", new Customer());
        return "create";
    }

    @PostMapping ("/customer/save")
    public String save (Customer customer, RedirectAttributes attributes){
        customerService.save( customer);
        attributes.addFlashAttribute("success","You added new customer");
        return "redirect:/home";
    }

    @GetMapping ("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customers", customerService.findByID(id));
        return "edit";
    }

    @PostMapping ("/customer/update")
    public String update (int id,Customer customer, RedirectAttributes attributes) {
        customerService.update(id, customer);
        attributes.addFlashAttribute("success","You edited a customer");
        return "redirect:/home";
    }


    @GetMapping ("/customer/{id}/delete")
    public String delete (@PathVariable int id, Model model) {
        model.addAttribute("customer",customerService.findByID(id));
        return "delete";
    }

    @PostMapping("/customer/remove")
    public String remove (int id, RedirectAttributes attributes) {
        customerService.remove(id);
        attributes.addFlashAttribute("success","You deleted a customer");
        return "redirect:/home";

    }
}