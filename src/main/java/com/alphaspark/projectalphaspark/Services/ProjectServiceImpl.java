package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Daos.ProjectDao;
import com.alphaspark.projectalphaspark.Entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{
    private final ProjectDao projectDao;

    public ProjectServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public Project addProject(Project project) {
        return projectDao.save(project);
    }

    @Override
    public Project getProject(Long projectId) {
        return projectDao.findById(projectId).orElse(null);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectDao.findAll();
    }

    @Override
    public List<Project> getClientProjects(Long clientId) {
        return null;
    }

    @Override
    public Project updateProject(Project project) {
        return projectDao.existsById(project.getId())?projectDao.save(project):null;
    }

    @Override
    public boolean deleteProject(Long projectId) {
        if(projectDao.existsById(projectId)) {
            projectDao.deleteById(projectId);
            return true;
        }
        return false;
    }
}
