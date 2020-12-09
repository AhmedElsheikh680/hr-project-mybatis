package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmps")
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee> emps = employeeService.getAllEmps();
		if(emps != null) {
			return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Employee>>(emps, HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Autowired
//	private EmployeeService employeeService;
//	
//	@Autowired
//	Environment env;
//	
//	@Value("${spring.application.name}")
//	String appName;
//
//	@GetMapping("/getAllDepts/{deptId}/getAllEmps")
//	public ResponseEntity<List<Employee>> getDeptEmps(@PathVariable long deptId){
//		List<Employee>emps = employeeService.getDeptEmps(deptId);
//		if(emps !=null) {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
//		}else {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	@GetMapping("/getAllEmps")
//	public ResponseEntity<List<Employee>> getAllEmps(){
//		System.out.println("App Name Is "+appName);
//		System.out.println("Naming "+ env.getProperty("spring.application.name"));
//		List<Employee> emps = employeeService.getAll();
//		if(emps != null) {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.NOT_FOUND);
//		}
//	}
//	
////	@GetMapping("/getById/{id}")
////	public ResponseEntity<Employee> getById(@PathVariable long id){
////		Employee emp = employeeService.getById(id);
////		if(emp !=null) {
////			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
////		}else {
////			return new ResponseEntity<Employee>(emp, HttpStatus.NOT_FOUND);
////		}
////	}
//	
//	@GetMapping("/getById")
//	public ResponseEntity<Employee> getById(@RequestParam long id){
//		Employee emp = employeeService.getById(id);
//		if(emp !=null) {
//			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
//		}else {
//			return new ResponseEntity<Employee>(emp, HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	
//	@GetMapping("/getByFirstNameAndLastName")
//	public ResponseEntity<List<Employee>> getByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName){
//		
//		List<Employee> emps = employeeService.getByFirstnameAndLastName(firstName, lastName);
//		if(emps !=null) {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
//		}else {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	
//	@GetMapping("/empSearch")
//	public ResponseEntity<List<Employee>> empSearch(@RequestParam String firstName, @RequestParam String lastName){
//		List<Employee> emps = employeeService.empSearch(firstName, lastName);
//		if(emps != null) {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
//		}else {
//			return new ResponseEntity<List<Employee>>(emps, HttpStatus.NOT_FOUND);
//
//		}
//	}
//	
//	@PostMapping("/addEmp")
//	public String addEmp(@RequestBody Employee emp){
//		employeeService.addEmp(emp);
//		return "Added Successfully!!";
//		
//	}
//	
//	@PutMapping("/updateEmp")
//	public String updateEmp(@RequestBody Employee emp) {
//		employeeService.updateEmp(emp);
//		return "Updated Successfully!!";
//	}
//	
//	@DeleteMapping("/deleteEmp")
//	public String deleteEmp(@RequestParam long id) {
//		employeeService.deleteEmp(id);
//		return "Deleted Successfully!!";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
