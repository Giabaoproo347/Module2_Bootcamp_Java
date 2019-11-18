package com.logIn.Controller;

import com.logIn.Dao.UserDao;
import com.logIn.Model.Login;
import com.logIn.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("login",new Login());
        return "home";
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.check(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }

}