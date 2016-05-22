package pl.employees.model.to;



public class DepartmentTo {
	
	private String departmentName;
	
	public DepartmentTo() {
	}
	
	public DepartmentTo(String departmentName) {
		this.departmentName=departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
