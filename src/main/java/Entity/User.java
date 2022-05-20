package Entity;

import java.util.List;

public class User {
    // Fields
    private Long id = 0L;

    private Access accessLvl;
    private String userName = null;

    private String password = null;

    private List<Project> projects= null;

    // Constructors

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        accessLvl = Access.MINIMUM;
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Access getAccessLvl() {
        return accessLvl;
    }

    public void setAccessLvl(Access accessLvl) {
        this.accessLvl = accessLvl;
    }



}
