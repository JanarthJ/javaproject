package model;

public class Employee {
	private int id;
	private String empname;
	private String empdept;
	private int empsalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
}
