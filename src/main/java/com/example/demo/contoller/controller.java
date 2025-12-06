package com.example.demo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DemoApplication;
import com.example.demo.entity.employeeentity;
import com.example.demo.service.servicelayer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/employee")
public class controller {

    private final DemoApplication demoApplication;

	
	@Autowired
	 servicelayer serv;


    controller(DemoApplication demoApplication) {
        this.demoApplication = demoApplication;
    }
	
	
	@PostMapping("/addemployee")
	public employeeentity AddEmployee(@RequestBody employeeentity emp) {
		//TODO: process POST request
		
		int b = emp.getId();
		System.out.println(b);
		return  serv.addeployee(emp);
	}
	
	
	@GetMapping("/view")
     public List<employeeentity> getallemployee()
     {
    	  return serv.showemp();
     }
	
}
