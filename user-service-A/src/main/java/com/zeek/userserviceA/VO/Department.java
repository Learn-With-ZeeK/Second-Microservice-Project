package com.zeek.userserviceA.VO;



public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
   
    
    
    
  //Constructors using superclass
  	public Department() {
  		super();
  	}
      
      //Constructors using fields
  	public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
  		super();
  		this.departmentId = departmentId;
  		this.departmentName = departmentName;
  		this.departmentAddress = departmentAddress;
  		this.departmentCode = departmentCode;
  	} 
      
      //Getters and Setters
  	    public Long getDepartmentId() {
  		return departmentId;
  	}

  	public void setDepartmentId(Long departmentId) {
  		this.departmentId = departmentId;
  	}

  	public String getDepartmentName() {
  		return departmentName;
  	}

  	public void setDepartmentName(String departmentName) {
  		this.departmentName = departmentName;
  	}

  	public String getDepartmentAddress() {
  		return departmentAddress;
  	}

  	public void setDepartmentAddress(String departmentAddress) {
  		this.departmentAddress = departmentAddress;
  	}

  	public String getDepartmentCode() {
  		return departmentCode;
  	}

  	public void setDepartmentCode(String departmentCode) {
  		this.departmentCode = departmentCode;
  	}
}