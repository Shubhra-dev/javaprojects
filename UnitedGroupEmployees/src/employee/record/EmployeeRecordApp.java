package employee.record;

import java.util.Scanner;

public class EmployeeRecordApp {
	static EmployeeRecord employeeR = new EmployeeRecord();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			displayMenu();
			int input = userInput();
			handleUserInput(input);
		}

	}

	private static void handleUserInput(int input) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner info = new Scanner(System.in);
		switch(input) {
		case 1:
			employeeR.display();
			break;
		case 2:
			employeeR.addEmployee();
			break;
		case 3:
			String idNo;
			idNo = info.next();
			double salaryRate;
			salaryRate = info.nextDouble();
			employeeR.salarySet(idNo,salaryRate);
			break;
		case 4:
			String idNo1;
			idNo1 = info.next();
			double increaseRate;
			increaseRate = info.nextDouble();
			employeeR.newSalarySet(idNo1,increaseRate);
			break;
		case 5:
			String idNo2;
			idNo2 = info.next();
			employeeR.isSmiling(idNo2);
			break;
		case 0:
			break;
		}
		
	}

	private static int userInput() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myScan = new Scanner(System.in);
		return myScan.nextInt();
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Application Menu -->");
		System.out.println("1.Display Informations.");
		System.out.println("2.Add Employee.");
		System.out.println("3.Set new salary rate.");
		System.out.println("4.Increase the rate.");
		System.out.println("5.Check 'Smile'");
		System.out.println("0. Exit.");
	}

}
