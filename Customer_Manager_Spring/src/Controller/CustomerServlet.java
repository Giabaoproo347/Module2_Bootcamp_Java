package Controller;
import Model.Customer;

import Service.CustomerService;
import Service.CustomerServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerServlet {
    private CustomerService customerService = new CustomerServiceimpl();

    @GetMapping("index")
    public String listCustomer(ModelMap map) {
       public List<Customer>
        map.addAttribute("customers", customers);
        return "list";

    }

//    @PostMapping("show")
//    public String listCustomer(Model model) {
//        List<Customer> customers = this.customerService.findAll();
//        model.addAttribute("customers", customers);
//        return "list";
}