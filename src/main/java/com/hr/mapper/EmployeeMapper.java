package com.hr.mapper;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hr.model.Employee;

@Mapper
public interface EmployeeMapper {

	public List<Employee> getAllEmps();
	
	
}
