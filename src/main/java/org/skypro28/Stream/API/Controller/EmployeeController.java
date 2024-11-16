package org.skypro28.Stream.API.Controller;

import java.util.Map;

import org.skypro28.Stream.API.Employee.Employee;
import org.skypro28.Stream.API.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/employee"})
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping({"/add"})
    public Employee addEmployee(@RequestParam String firstName,
                                @RequestParam String lastName) {
        return this.service.add(firstName, lastName);
    }

    @GetMapping({"/remove"})
    public Employee removeEmployee(@RequestParam String firstName,
                                   @RequestParam String lastName) {
        return this.service.remove(firstName, lastName);
    }

    @GetMapping({"/fine"})
    public Employee fineEmployee(@RequestParam String firstName,
                                 @RequestParam String lastName) {
        return this.service.fine(firstName, lastName);
    }

    @GetMapping
    public Map<String, String> allEmployee() {
        return this.service.allEmployee();
    }
}

