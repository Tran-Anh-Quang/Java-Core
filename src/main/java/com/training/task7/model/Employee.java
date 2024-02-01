package com.training.task7.model;

public class Employee {

    private String name;

    private String department;

    private String skill;

    public Employee(String name, String department, String skill) {
        this.name = name;
        this.department = department;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSkill() {
        return skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
