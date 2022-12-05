package com.scientificwork.ProjectManager.service;

import com.scientificwork.ProjectManager.entity.Project;
import com.scientificwork.ProjectManager.repository.ProjectRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ProjectService {
    private final ProjectRepo projectRepo;

    public Project findById(Long id){
        return projectRepo.findById(id).orElseThrow();
    }

    public void save(Project project){
        projectRepo.save(project);
    }

    public List<Project> findAll(){
        return projectRepo.findAll();
    }
}
