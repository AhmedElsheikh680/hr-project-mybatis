package com.hr.model;




public class Department {
	
	
	private long id;

	private String departmentName;
	private long locationId;
	private long managerId;
	public Department() {
		super();
	}
	public Department(long id, String departmentName, long locationId, long managerId) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.locationId=locationId;
		this.managerId=managerId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	
}
