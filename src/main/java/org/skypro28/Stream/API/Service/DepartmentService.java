package org.skypro28.Stream.API.Service;

import org.skypro28.Stream.API.Employee.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee searchMinSalaryDepartment(int department);

    Employee searchMaxSalaryDepartment(int department);

    Collection<Employee> employeesDepartment(int department);

    Map<Object, List<Object>> allEmployeesDepartments();

}
