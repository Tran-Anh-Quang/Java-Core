package com.training.task7.controller;

import com.training.task7.View.EmployeeView;
import com.training.task7.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeController {
    private final List<Employee> employees;

    private final EmployeeView employeeView;

    public EmployeeController(){
        employees = new ArrayList<>();
        employeeView = new EmployeeView();
    }

    public void addEmployee(String name, String department, String skill){
        Employee employee = new Employee(name, department, skill);
        employees.add(employee);
    }

    public boolean deleteEmployee(Employee employee){
        if (employees.contains(employee)) {
            employees.remove(employee);
            return true;
        } else {
            return false;
        }
    }

    public void updateEmployee(Employee employee, String name, String department, String skill){
        employee.setName(name);
        employee.setDepartment(department);
        employee.setSkill(skill);
    }

    public void displayEmployeeDetails(Employee employee){
        employeeView.printEmployeeDetails(employee);
    }

    public void displayEmployeeList(List<Employee> employees){
        employeeView.printEmployeeList(employees);
    }

    public void sortByDepartment(List<Employee> employees){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getDepartment().compareTo(employee2.getDepartment());
            }
        });

        displayEmployeeList(employees);
    }

    public void sortBySkill(List<Employee> employees){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSkill().compareTo(o2.getSkill());
            }
        });
        displayEmployeeList(employees);
    }

    // Method to get the list of employees
    public List<Employee> getEmployees() {
        return employees;
    }
}
