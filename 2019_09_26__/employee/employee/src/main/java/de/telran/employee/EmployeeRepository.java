package de.telran.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);

}
