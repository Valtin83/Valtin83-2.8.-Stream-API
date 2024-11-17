package org.skypro28.Stream.API.Service;

import org.skypro28.Stream.API.Employee.Employee;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class DepartmentServiceImpl implements DepartmentService {

    private EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee searchMinSalaryDepartment(int departmentId) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .min(Comparator.comparingInt(employee -> employee.getSalary()));
    }

    public Employee searchMaxSalaryDepartment(int departmentId) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .max(Comparator.comparingInt(employee -> employee.getSalary()));
    }

    public Collection<Employee> employeesDepartment(int departmentId) {
        return  employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    public Map<Object, List<Object>> allEmployeesDepartments() {
        return employeeService.findAll().stream()
                .collect(groupingBy(Employee::getDepartment));
    }

}
