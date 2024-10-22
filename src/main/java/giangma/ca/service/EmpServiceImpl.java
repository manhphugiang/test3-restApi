package giangma.ca.service;

import giangma.ca.beans.Employee;
import giangma.ca.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll(); // No need to cast to ArrayList
    }

    @Override
    public Employee findEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById((long) id);
        return employee.orElse(null);
    }

    @Override
    public void addEmployee(Employee employee) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Lucknow", "Shubham"));
        emp.add(new Employee( "Delhi", "Puneet"));
        emp.add(new Employee( "Pune", "Abhay"));
        emp.add(new Employee( "Noida", "Anurag"));
        for (int i=0; i<emp.size(); i++) {
            employeeRepo.save(employee);
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepo.deleteAll();
    }
}
