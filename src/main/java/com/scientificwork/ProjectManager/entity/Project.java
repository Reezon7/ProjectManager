package com.scientificwork.ProjectManager.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id", nullable = false)
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "project")
    private List<Task> tasks;

}
