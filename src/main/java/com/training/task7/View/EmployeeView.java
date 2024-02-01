package com.training.task7.View;

import com.training.task7.model.Employee;

import java.util.List;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Skill: " + employee.getSkill());
        System.out.println();
    }

    public void printEmployeeList(List<Employee> employees) {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Department: " + employee.getDepartment() + ", Skill: " + employee.getSkill());
        }
    }
}
