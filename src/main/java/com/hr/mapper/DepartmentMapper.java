package com.hr.mapper;




import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hr.model.Department;

@Mapper
public interface DepartmentMapper {
	
//	@Select("select id id, department_name departmentName from departments")
//	public List<Department> findAll();
	
	@Select("select id, department_name, location_id, manager_id  from departments")
	@Results(value = {
			@Result(property = "id", column = "id"),
			@Result(property = "departmentName", column = "department_name"),
			@Result(property = "locationId", column = "location_id"),
			@Result(property = "managerId", column = "manager_id")
	})
	public List<Department> findAll();
	
	
	@Select("select id, department_name, location_id, manager_id from departments where id= #{deptId}")
	@Results(value = {
			@Result(property = "id", column = "id"),
			@Result(property = "departmentName", column = "department_name"),
			@Result(property = "locationId", column = "location_id"),
			@Result(property = "managerId", column = "manager_id")
	})
	public Department getDeptById(long deptId);
	
	
	@Insert("insert into departments(id, department_name, location_id, manager_id) values(#{id}, #{departmentName}, #{locationId}, #{managerId})")
	public void addDept(Department dept);
	
	@Update("update departments set department_name= #{departmentName}, location_id= #{locationId}, manager_id= #{managerId} where id= #{id}")
	public void updateDept(Department deptId);
	
	
	@Delete("delete from departments where id= #{deptId}")
	public void deleteDept(long deptId);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
