package employee.record;

public class SalariedEmploye extends Employee {

	private double salary;

	public SalariedEmploye(String name, String idNo, double salary) {
		super(name, idNo);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void salarySet(double salaryRate) {
		// TODO Auto-generated method stub
		setSalary(salaryRate);
	}

	@Override
	public void increaseSalaryRate(double increaseRate) {
		// TODO Auto-generated method stub
		setSalary(getSalary() + increaseRate);
	}
	

}
