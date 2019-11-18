package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoney {

    @GetMapping ("/convert")
    public String index() {
        return "index";
    }

    @PostMapping("/usd")
    public String  submit(@RequestParam String usd, String rate, Model model){
        Double VND = Double.parseDouble(usd) * Double.parseDouble(rate);
        model.addAttribute("vnd",VND);
        return "index";
    }
}
