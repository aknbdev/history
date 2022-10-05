package com.isystem.demo.services;
import com.isystem.demo.models.Employee;
import com.isystem.demo.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;


    public Boolean createEmployee(Employee requestEmployee) {
        Optional<Employee> emailHas = employeeRepo.findByEmail(requestEmployee.getEmail());
        Optional<Employee> phoneHas = employeeRepo.findByPhone(requestEmployee.getPhone());
        if (emailHas.isPresent() && phoneHas.isPresent()){
            employeeRepo.save(requestEmployee);
            return true;
        }
        return false;
    }

    public Employee getById(Long id) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (optionalEmployee.isEmpty()){
            return null;
        }
        return optionalEmployee.get();
    }

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public Boolean deleteById(Long id) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (optionalEmployee.isEmpty()){
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }

    public Boolean updateById(Long id, Employee requestEmployee) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);

        Optional<Employee> emailHas = employeeRepo.findByEmail(requestEmployee.getEmail());

        Optional<Employee> phoneHas = employeeRepo.findByPhone(requestEmployee.getPhone());

        if (optionalEmployee.isPresent()){
                requestEmployee.setId(id);
                employeeRepo.save(requestEmployee);
                return true;
        }
        return false;
    }

    public Employee getByEmail(String requestEmail) {
        Optional<Employee> optionalEmployee = employeeRepo.findByEmail(requestEmail);
        if (optionalEmployee.isEmpty()){
            return null;
        }
        return optionalEmployee.get();
    }

    public List<Employee> getByJob(String requestJob) {
        List<Employee> employeeList =  employeeRepo.findAllByJobTitle(requestJob);
        if (employeeList.isEmpty()){
            return null;
        }
        return employeeList;
    }
}
