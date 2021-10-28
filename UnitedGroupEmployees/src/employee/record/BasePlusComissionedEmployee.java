package employee.record;

public class BasePlusComissionedEmployee extends ComissionedEmployee {
	private double fixedSalary;
	private double rate = 0.20;
	public BasePlusComissionedEmployee(String name, String idNo, double totalSell, double fixedSalary) {
		super(name, idNo, totalSell);
		this.fixedSalary = fixedSalary;
		setSalary(this.fixedSalary + (this.totalSell * rate));
	}
	public double getFixedSalary() {
		return fixedSalary;
	}
	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	

}
