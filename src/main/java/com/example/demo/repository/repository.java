package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.employeeentity;

public interface repository extends JpaRepository<employeeentity, Integer> {
	 System.out.println("vishal ");
}
