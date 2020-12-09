package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EmployeeMapper;
import com.hr.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmps(){
		return employeeMapper.getAllEmps();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Autowired
//	private EmployeeRepo employeeRepo;
//	
//	
//	public List<Employee> getDeptEmps(long deptId){
//		return employeeRepo.findByDepartmentId(deptId);
//	}
//	
//	public List<Employee> getAll(){
//		return employeeRepo.findAll();
//	}
//	
//	public Employee getById(long id) {
//		return employeeRepo.findById(id).get();
//	}
//	
//	public List<Employee> getByFirstnameAndLastName(String firstName, String lastName){
//		return employeeRepo.findAllByFirstNameAndLastName(firstName, lastName);
//	}
//	
//	public List<Employee> empSearch(String firstName, String lastName){
//		return employeeRepo.empSearch(firstName, lastName);
//	}
//	
//	public void addEmp(Employee emp) {
//		 employeeRepo.save(emp);
//	}
//	
//	public void updateEmp(Employee emp) {
//		employeeRepo.save(emp);
//	}
//	
//	public void deleteEmp(long id) {
//		employeeRepo.deleteById(id);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
