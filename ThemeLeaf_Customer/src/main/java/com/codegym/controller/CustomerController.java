package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    private CustomerService customerService = new ICustomerService();

    @GetMapping ("/home")
    public String index(Model model) {
        model.addAttribute("customers",customerService.findAll());
        return "home";
    }


    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customers",new Customer());
        return "create";
    }
    @PostMapping ("/customer/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes) {
//        customer.setId((int)(Math.random()*10000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","You added new customer");
        return "redirect:/home";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findByID(id));
        return "edit";
    }

    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerService.update(customer.getId(), customer);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/home";
    }

    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findByID(id));
        return "delete";
    }

    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/home";
    }

    @GetMapping ("/customer/{id}/view")
    public String view (@PathVariable int id, Model model) {
        model.addAttribute("customer",customerService.findByID(id));
        return "view";

    }

}
