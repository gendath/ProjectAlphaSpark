package com.alphaspark.projectalphaspark.Entities;

import com.alphaspark.projectalphaspark.Entities.Users.Client;
import com.alphaspark.projectalphaspark.Entities.Users.Employee;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Milestone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objective;

    private Date goalDate;

    private int releaseAmount;

    private Date completionDate;

    @OneToOne
    private Employee signedOffBy;

    @OneToOne
    private Client approvedBy;

    private boolean isCompleted = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Date getGoalDate() {
        return goalDate;
    }

    public void setGoalDate(Date goalDate) {
        this.goalDate = goalDate;
    }

    public int getReleaseAmount() {
        return releaseAmount;
    }

    public void setReleaseAmount(int releaseAmount) {
        this.releaseAmount = releaseAmount;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Employee getSignedOffBy() {
        return signedOffBy;
    }

    public void setSignedOffBy(Employee signedOffBy) {
        this.signedOffBy = signedOffBy;
    }

    public Client getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Client approvedBy) {
        this.approvedBy = approvedBy;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
