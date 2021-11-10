package com.albin.demowebsite;


import com.albin.demowebsite.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/signup")
    public String signup(Model model){

        model.addAttribute("details",homeService.getDetails());


        return "sign-up";
    }






}
