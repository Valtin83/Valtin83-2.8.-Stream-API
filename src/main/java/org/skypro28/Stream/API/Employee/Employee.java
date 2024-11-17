package org.skypro28.Stream.API.Employee;

import com.fasterxml.jackson.annotation.JsonGetter;
import io.micrometer.observation.transport.Propagator;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private static int departmentId;
    private static double salary;

    public Employee(String firstName, String lastName, int departmentId, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    @JsonGetter
    public static double getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return departmentId == employee.departmentId && Double.compare(salary, employee.salary) == 0 && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, departmentId, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", departmentId=" + departmentId +
                ", salary=" + salary +
                '}';
    }


    public static Object getDepartment(Object o) {
        return departmentId;
    }
}