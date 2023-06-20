package com.smart.crew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smart.crew.model.CustomerData;
import com.smart.crew.service.CustomerServices;

@RestController
public class DrivingScore {
	
	@Autowired
    CustomerServices cs;
	
	@GetMapping("customer/{id}")
	public int getDS(@PathVariable("id") String id)
	{
	     CustomerData cd=cs.read(id);
	
	   if(cd.getCustId().equals("cust000001"))
		 return 700;
	  else if(cd.getCustId().equals("cust000002"))
		return 750;
	  else
		return 500;
	}
}
