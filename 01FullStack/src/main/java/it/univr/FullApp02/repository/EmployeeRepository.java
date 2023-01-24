package it.univr.FullApp02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.univr.FullApp02.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
