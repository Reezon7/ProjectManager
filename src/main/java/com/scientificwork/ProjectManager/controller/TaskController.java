package com.scientificwork.ProjectManager.controller;

import com.scientificwork.ProjectManager.service.MainService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Data
@RequestMapping("/tasks")
public class TaskController {
    private final MainService mainService;

    @GetMapping
    public String getTasks(Model model){
        model.addAttribute("tasks", mainService.getTasks());
        model.addAttribute("projects", mainService.getProjects());
        return "index";
    }
}
