package it.univr.FullApp02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.univr.FullApp02.model.Employee;
import it.univr.FullApp02.repository.EmployeeRepository;

@RestController
@RequestMapping("/v1/")
public class EmployeeController {

    @Autowired // lasciamo in gestione a spring per la gestione interna
    private EmployeeRepository employeeRepository;

    // get all employee
    @GetMapping("/v2")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}