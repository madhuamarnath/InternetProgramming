package com.rmkcet;

public class StudentBean implements java.io.Serializable{
	private static final long serialVersionUID = -8535189089312106728L;
	private int registerNumber;
	private String name;
	private double cgpa;
	private int departmentId;
	
	public StudentBean() {
		
	}
	
	public int getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
}
