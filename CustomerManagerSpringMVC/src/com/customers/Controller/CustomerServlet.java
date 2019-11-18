package com.customers.Controller;

import com.customers.Model.Customer;
import com.customers.Service.CustomerService;
import com.customers.Service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerServlet {
   @Autowired
   CustomerService customerService = new ICustomerService();

    @GetMapping ("/home")
    public String index (Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "home";
    }

    @GetMapping("/add")
    public String add (@RequestParam int id, String name, String email, String address, Model model) {
        Customer customer = new Customer(id,name,email,address);
        model.addAttribute("customers", customer);
        return "add";
    }

    @GetMapping("/customer/delete")
    public String delete (@RequestParam int id, Model model) {
       model.addAttribute("customers", customerService.delete(id));
        return "home";
    }


}
