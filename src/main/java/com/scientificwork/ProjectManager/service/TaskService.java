package com.scientificwork.ProjectManager.service;

import com.scientificwork.ProjectManager.entity.Task;
import com.scientificwork.ProjectManager.repository.TaskRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class TaskService {
    private final TaskRepo taskRepo;

    public void save(Task task){
        taskRepo.save(task);
    }

    public Task findById(Long id){
        return taskRepo.findById(id).orElseThrow();
    }

    public List<Task> findAll(){
        return taskRepo.findAll();
    }
}
