package de.telran.employee;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String department;

    public Employee() {
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    /*@Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }*/

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
