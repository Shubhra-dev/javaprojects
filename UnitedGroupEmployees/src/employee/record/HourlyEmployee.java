package employee.record;

public class HourlyEmployee extends Employee {

	private int workHour;
	private double salaryPerHour = 80;
	public HourlyEmployee(String name, String idNo, int workHour) {
		super(name, idNo);
		this.workHour = workHour;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public double getSalaryPerHour() {
		return salaryPerHour;
	}
	public void setSalaryPerHour(double salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}
	@Override
	public void salarySet(double salaryRate) {
		// TODO Auto-generated method stub
		setSalary(getWorkHour() * salaryRate);
		
	}
	@Override
	public void increaseSalaryRate(double increaseRate) {
		// TODO Auto-generated method stub
		setSalary(getWorkHour()*(getSalaryPerHour()+ increaseRate));
	}
}
