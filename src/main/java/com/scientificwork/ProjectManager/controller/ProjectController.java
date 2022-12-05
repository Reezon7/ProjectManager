package com.scientificwork.ProjectManager.controller;

import com.scientificwork.ProjectManager.entity.Project;
import com.scientificwork.ProjectManager.service.MainService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Data
@RequestMapping("/project")
public class ProjectController {
    private final MainService mainService;

    @PostMapping("/save")
    public String saveProject(Project project, Model model){
        mainService.saveProject(project);
        return "redirect:/";
    }

    @GetMapping("/")
    public String getProjects(Model model){
        model.addAttribute("projects", mainService.getProjects());
        System.out.println("it works");
        return "index";
    }
}
