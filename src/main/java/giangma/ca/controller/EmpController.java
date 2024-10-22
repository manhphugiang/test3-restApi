package giangma.ca.controller;


import giangma.ca.beans.Employee;
import giangma.ca.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpServiceImpl empServiceImpl;

    @PostMapping("/")
    public void add(){
        empServiceImpl.addEmployee(new Employee());
    }

    @GetMapping("/get")
    public List<Employee> getAll(){
        return empServiceImpl.findAllEmployees();
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findEmployeeById((int) id);
    }

    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteEmployee(new Employee());
    }
}