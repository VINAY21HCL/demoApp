package com.hcl.employee.parking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CitizenRequest;
import com.example.demo.entity.Citizen;

@RestController
@RequestMapping("/app-hcl")
public class EmployeeParkingController {
	
	@PostMapping(path = "/addDetails")
	public ResponseEntity<Citizen>addCitizenDetails(@RequestBody CitizenRequest resq ){
		Citizen ci=citizenService.addCitizenDetails(resq);
		return new ResponseEntity<Citizen>(ci,HttpStatus.OK);
	}
	

}
