package employee.record;

public class ComissionedEmployee extends Employee implements Smile {
	protected double totalSell;
	private double rate = 0.25;
	public ComissionedEmployee(String name, String idNo, double totalSell) {
		super(name, idNo);
		this.totalSell = totalSell;
		setSalary(this.totalSell * rate);
	}
	public double getTotalSell() {
		return totalSell;
	}
	public void setTotalSell(double totalSell) {
		this.totalSell = totalSell;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public void salarySet(double salaryRate) {
		// TODO Auto-generated method stub
		setSalary(getTotalSell() * salaryRate);
	}
	@Override
	public void increaseSalaryRate(double increaseRate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void verifySmile(String idNo) {
		if(this.getIdNo().equals(idNo)) {
		System.out.println( getName() + " is smiling.");
	}
		else {
			System.out.println( getName() + " is not smiling.");
		}
	}

}
