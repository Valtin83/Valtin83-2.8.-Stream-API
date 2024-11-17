package org.skypro28.Stream.API.Controller;

import org.skypro28.Stream.API.Employee.Employee;
import org.skypro28.Stream.API.Service.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentServiceImpl departmentService;

    public DepartmentController(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee maxSalaryDepartment(@RequestParam int department) {
        return departmentService.searchMaxSalaryDepartment(department);
    }

    @GetMapping("/min-salary")
    public Employee minSalaryDepartment(@RequestParam int department) {
        return departmentService.searchMinSalaryDepartment(department);
    }

    @GetMapping(value = "/all", params = {"department"})
    public Collection<Employee> allDepartment(@RequestParam int department) {
        return departmentService.employeesDepartment(department);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> all() {
        return departmentService.allEmployeesDepartments();
    }
}
