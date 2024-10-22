package giangma.ca.service;

import giangma.ca.beans.Employee;

import java.util.List;

public interface EmpService {

    List<Employee> findAllEmployees();
    Employee findEmployeeById(int id);
    void addEmployee(Employee employee); // Change this
    void deleteEmployee(Employee employee); // Change this
}
