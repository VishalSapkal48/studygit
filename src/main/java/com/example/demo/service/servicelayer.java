package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employeeentity;
import com.example.demo.repository.repository;

@Service
public class servicelayer {

	
	@Autowired
	repository repo;
	
	
	public employeeentity addeployee(employeeentity emp) {
		 
 		employeeentity e = repo.save(emp);
		
		return e;
	}


	public List<employeeentity> showemp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



    
}
