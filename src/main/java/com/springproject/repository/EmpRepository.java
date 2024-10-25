package com.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>{
	

}
