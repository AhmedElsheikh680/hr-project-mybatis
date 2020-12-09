package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.DepartmentMapper;
import com.hr.model.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	 
	public List<Department> getAll(){
		return departmentMapper.findAll();
	}
	
	public Department getDeptById(long deptId) {
		return departmentMapper.getDeptById(deptId);
	}
	
	public void insertDept(Department dept) {
		departmentMapper.addDept(dept);
	}
	
	public void updateDept(Department dept) {
		departmentMapper.updateDept(dept);
	}
	
	public void deleteDept(long deptId) {
		departmentMapper.deleteDept(deptId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Autowired
//	private DepartmentRepo departmentRepo;
//	
//	public List<Department> getAllDepts(){
//		return departmentRepo.findAll();
//	}
//	
//	public Department getDeptById(long deptId) {
//		return departmentRepo.findById(deptId).orElseThrow(null);
//	}
//	
//	public void addDept(Department dept) {
//		departmentRepo.save(dept);
//	}
//	
//	public void updateDept(Department dept) {
//		departmentRepo.save(dept);
//	}
//	
//	public void deleteDept(long deptId) {
//		departmentRepo.deleteById(deptId);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
