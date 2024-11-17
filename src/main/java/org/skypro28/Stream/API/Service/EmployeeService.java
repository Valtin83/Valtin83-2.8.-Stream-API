package org.skypro28.Stream.API.Service;


import org.skypro28.Stream.API.Employee.Employee;

import java.util.Collection;
import java.util.Map;

public interface EmployeeService {

    Employee remove(String firstName, String lastName, int departmentId, double salary);

    Employee add(String firstName, String lastName, int departmentId, double salary);

    Employee fine(String firstName, String lastName, int departmentId, double salary);

    Map<String, Employee> allEmployee();

    Collection<Employee> findAll();
}