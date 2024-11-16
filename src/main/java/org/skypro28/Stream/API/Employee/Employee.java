package org.skypro28.Stream.API.Employee;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getKeyFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Employee employee = (Employee)obj;
            return Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName);
        } else {
            return false;
        }
    }

    public String toString() {
        return "Employee{firstName='" +
                this.firstName + "', lastName='" +
                this.lastName + "'}";
    }
}

