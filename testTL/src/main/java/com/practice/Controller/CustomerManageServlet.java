package com.practice.Controller;

import com.practice.Model.Customer;
import com.practice.Service.CustomerService;
import com.practice.Service.ICustomerService;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerManageServlet {
    private CustomerService customerService = new ICustomerService();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "index";
    }
}
