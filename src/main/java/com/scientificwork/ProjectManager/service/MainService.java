package com.scientificwork.ProjectManager.service;

import com.scientificwork.ProjectManager.entity.Project;
import com.scientificwork.ProjectManager.entity.Task;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class MainService {
    private final ProjectService projectService;
    private final TaskService taskService;

    public void saveTask(Task task, Long projectId){
        Project project = projectService.findById(projectId);
        task.setProject(project);
        taskService.save(task);
    }

    public void saveProject(Project project){
        Project existingProject = projectService.findById(project.getId());
        if (existingProject == null){
            throw new IllegalArgumentException();
        }
        projectService.save(project);
    }

    public List<Project> getProjects(){
        return projectService.findAll();
    }

    public List<Task> getTasks(){
        return taskService.findAll();
    }
}
