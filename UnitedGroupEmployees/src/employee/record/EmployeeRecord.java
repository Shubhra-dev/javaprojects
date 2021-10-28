package employee.record;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRecord {
	ArrayList<Employee> employee = new ArrayList<Employee>();

	public void display() {
		// TODO Auto-generated method stub
		for(Employee Aemployee : employee) {
			 Aemployee.display();
		}
	}

	@SuppressWarnings("unused")
	public void addEmployee() {
		// TODO Auto-generated method stub
		String name1;
		String idNo;
		@SuppressWarnings("resource")
		Scanner data = new Scanner(System.in);
		int choice = data.nextInt();
		data.nextLine();
		System.out.println("1.Salaried Emplyee");
		System.out.println("2.Hourly Emplyee");
		System.out.println("1.Commissioned Emplyee");
		System.out.println("1.Base + Commissioned Emplyee");
		switch(choice) {
		case 1:
			System.out.println("Enter the name of the employee.");
			name1 = data.next();
			System.out.println("Enter the ID of the employee.");
			idNo = data.next();
			System.out.println("Enter the Salary of the employee.");
			double salary = data.nextDouble();
			data.nextLine();
			Employee addSalariedEmployee = new SalariedEmploye(name1,idNo,salary);
			employee.add(addSalariedEmployee);
			break;
		case 2:
			System.out.println("Enter the name of the employee.");
			name1 = data.next();
			System.out.println("Enter the ID of the employee.");
			idNo = data.next();
			System.out.println("Enter the Working hour of the employee.");
			int workHour = data.nextInt();
			data.nextLine();
			Employee addHourlyEmployee = new HourlyEmployee(name1,idNo,workHour);
			employee.add(addHourlyEmployee);
		case 3:
			System.out.println("Enter the name of the employee.");
			name1 = data.next();
			System.out.println("Enter the ID of the employee.");
			idNo = data.next();
			System.out.println("Enter the Total Sell of the employee.");
			int totalSell = data.nextInt();
			data.nextLine();
			Employee addCmsndEmployee = new ComissionedEmployee(name1,idNo,totalSell);
			employee.add(addCmsndEmployee);
		case 4:
			System.out.println("Enter the name of the employee.");
			name1 = data.next();
			System.out.println("Enter the ID of the employee.");
			idNo = data.next();
			System.out.println("Enter the Total Sell of the employee.");
			double totalSell2 = data.nextDouble();
			System.out.println("Enter the Fixed Salary of the employee.");
			double fSalary = data.nextDouble();
			data.nextLine();
			Employee addBplusCEmployee = new BasePlusComissionedEmployee(name1,idNo,fSalary,totalSell2);
			employee.add(addBplusCEmployee);
		}
	}

	public void salarySet(String idNo, double salaryRate) {
		// TODO Auto-generated method stub
		for(Employee Aemployee : employee) {
			if(Aemployee.getIdNo().equals(idNo)) {
				Aemployee.salarySet(salaryRate);
			}
		}
		
	}

	public void newSalarySet(String idNo1, double increaseRate) {
		// TODO Auto-generated method stub
		for(Employee Aemployee : employee) {
			if(Aemployee.getIdNo().equals(idNo1)) {
				Aemployee.increaseSalaryRate(increaseRate);
			}
		}
	}

	public void isSmiling(String idNo2) {
		for(Employee Aemployee : employee) {
			if(Aemployee.getIdNo().equals(idNo2)) {
				if(Aemployee instanceof ComissionedEmployee) {
					((ComissionedEmployee)Aemployee).verifySmile(idNo2);
				}
				else {
					System.out.println( "Wrong info!");

				}
			}
		
	}
	}

}
