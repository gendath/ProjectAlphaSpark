package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Milestone;

import java.util.List;

public interface MilestoneService {

    List<Milestone> getProjectMilestone(Long projectId);
    Milestone getMilestone(Long milestoneId);
    Milestone addMilestone(Milestone milestone);
    Milestone updateMilestone(Milestone milestone);
    Milestone deleteMilestone(Long milestoneId);

}
