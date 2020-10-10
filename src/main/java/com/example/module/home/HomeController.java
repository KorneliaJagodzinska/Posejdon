package com.example.module.home;

import com.example.core.config.PosejdonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private PosejdonConfig posejdonConfig;

    @Autowired
    private HomeService homeService;


    @RequestMapping({"/", "/index.html", "/index.php"})
    public String getHome(Model model) {
        model.addAttribute("greetings", homeService.getGreetings());
        return "home";
    }

    @RequestMapping("/config")
    public String getConfig(Model model) {
        model.addAttribute("posejdonConfig", posejdonConfig);
        return "home";
    }
}

