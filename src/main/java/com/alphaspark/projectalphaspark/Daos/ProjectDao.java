package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDao extends JpaRepository<Project, Long> {


}
