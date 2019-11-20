package de.telran.employee;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

//    private final List<Employee> employees = new ArrayList<>();

    private final EmployeeRepository employees;

    public EmployeeController(EmployeeRepository employees){
        this.employees = employees;
    }


    @PostMapping("/employees")
    void addEmployee(@RequestBody Employee employee){
        employees.save(employee);
    }

//    @GetMapping("/employees")
    List<Employee> getAll(){
        return employees.findAll();
    }

    @GetMapping("/employees/{id}")
    Employee getById(@PathVariable long id) throws Exception{
        return employees.findById(id).orElseThrow(Exception::new);
    }

    @GetMapping("/employee")
    @ResponseBody
    List<Employee> getByName(@RequestParam(value = "name", required = false) String name){
        System.err.println("name " + name);
        if(name == null){
            return getAll();
        }
        return employees.findByName(name);
    }

   /* @GetMapping("/employee_search")
    @ResponseBody
    List<Employee> getByName(@RequestParam(value = "byName", required = false) String name){
        System.err.println("name " + name);
        if(name == null){
            return getAll();
        }
        return
                employees
                        .stream()
                        .filter(e -> e.getName().equals(name))
                        .collect(Collectors.toList());
    }*/
}
