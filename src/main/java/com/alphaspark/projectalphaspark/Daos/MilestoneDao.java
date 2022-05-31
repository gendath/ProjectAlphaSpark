package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.Milestone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilestoneDao extends JpaRepository<Milestone,Long> {
}
