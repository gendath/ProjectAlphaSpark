package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Project;

import java.util.List;

public interface ProjectService {

    // Create functions
    Project addProject(Project project);

    // Read functions
    Project getProject(Long projectId);

    List<Project> getAllProjects();

    List<Project> getClientProjects(Long clientId);

    // Update functions
    Project updateProject(Project project);

    // Delete functions
    boolean deleteProject(Long projectId);




}
