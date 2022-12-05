package com.scientificwork.ProjectManager.controller;

import com.scientificwork.ProjectManager.service.MainService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class MainController {
    private final MainService mainService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("projects", mainService.getProjects());
        System.out.println("lol");
        return "index";
    }
}
