package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
	
@Entity
public class model {

	@Id
    private int id;
    private String employeeName;
    private int employeeAge;
    private long salary;

    // Default constructor
    public model() {
        super();
    }

    // Parameterized constructor
    public model(int id, String employeeName, int employeeAge, long salary) {
        super();
        this.id = id;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.salary = salary;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter for employeeAge
    public int getEmployeeAge() {
        return employeeAge;
    }

    // Setter for employeeAge
    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    // Getter for salary
    public long getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(long salary) {
        this.salary = salary;
    }
}