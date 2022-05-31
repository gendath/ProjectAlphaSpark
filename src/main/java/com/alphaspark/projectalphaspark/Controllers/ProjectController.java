package com.alphaspark.projectalphaspark.Controllers;

import com.alphaspark.projectalphaspark.Entities.Project;
import com.alphaspark.projectalphaspark.Services.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    //create
    @PostMapping("/new")
    public String createProject(@RequestBody Project project){
        return null;
    }

    //read all
    @GetMapping({"/", ""})
    public List<Project> listAllProjects(){
        return projectService.getAllProjects();
    }

    //read one
    @GetMapping("/{projectID}")
    public Project displaySingleProject(@PathVariable Long projectID){
        return projectService.getProject(projectID);
    }

    //update
    @PutMapping("/update")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }

    //delete
    @DeleteMapping("/delete")
    public boolean deleteProject(@RequestBody Project project){
        return projectService.deleteProject(project.getId());
    }
}
