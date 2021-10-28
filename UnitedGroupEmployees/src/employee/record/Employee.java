package employee.record;

public abstract class Employee {
	private String name;
	private String idNo;
	private double salary;
	public void display() {
		System.out.println("Name: "+ name +", ID: " + idNo + ", Salary: "+ salary + " ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String idNo) {
		super();
		this.name = name;
		this.idNo = idNo;
	}
	public abstract void salarySet (double salaryRate);
	public abstract void increaseSalaryRate (double increaseRate);
}
