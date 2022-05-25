package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{
    @Override
    public boolean addProject() {
        return false;
    }

    @Override
    public Project getProject(Long projectId) {
        return null;
    }

    @Override
    public List<Project> getAllProjects() {
        return null;
    }

    @Override
    public List<Project> getClientProjects(Long clientId) {
        return null;
    }

    @Override
    public boolean updateProject(Project project) {
        return false;
    }

    @Override
    public boolean deleteProject(Long projectId) {
        return false;
    }
}
