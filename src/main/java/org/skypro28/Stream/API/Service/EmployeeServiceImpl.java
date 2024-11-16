package org.skypro28.Stream.API.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.skypro28.Stream.API.Employee.Employee;
import org.skypro28.Stream.API.Exception.EmployeeAlreadyAddedException;
import org.skypro28.Stream.API.Exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public Map<String, String> employees = new HashMap();

    public EmployeeServiceImpl() {
    }

    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (this.employees.containsKey(employee.getKeyFullName())) {
            throw new EmployeeAlreadyAddedException("Работник уже в списке");
        } else {
            this.employees.put(employee.getKeyFullName(), String.valueOf(employee));
            return employee;
        }
    }

    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (this.employees.containsKey(employee.getKeyFullName())) {
            this.employees.remove(employee.getKeyFullName());
            return employee;
        } else {
            throw new EmployeeNotFoundException("Работника нет в списке");
        }
    }

    public Employee fine(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (this.employees.containsKey(employee.getKeyFullName())) {
            return employee;
        } else {
            throw new EmployeeNotFoundException("Работника нет в списке");
        }
    }

    public Map<String, String> allEmployee() {
        return Collections.unmodifiableMap(this.employees);
    }
}
