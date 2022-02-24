package model;


import java.util.List;

public class Employee {

    private String name;
    private String lastName;
    private String password;
    private Integer workhours;
    private String profession;


    public void setPassword(String password) {
        this.password = password;
    }

    public void setWorkhours(Integer workhours) {
        this.workhours = workhours;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Integer getWorkhours() {
        return workhours;
    }

    public String getProfession() {
        return profession;
    }
}