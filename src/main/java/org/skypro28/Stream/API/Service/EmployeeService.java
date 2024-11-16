package org.skypro28.Stream.API.Service;

import org.skypro28.Stream.API.Employee.Employee;
import java.util.Map;


public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee fine(String firstName, String lastName);

    Map<String, String> allEmployee();
}

