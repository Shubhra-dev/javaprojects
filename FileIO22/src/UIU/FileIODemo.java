package UIU;

import java.io.BufferedReader;
import java.util.Scanner;

public class FileIODemo {
	public static void main(String[]args) {
		String fileName = "data.txt";
		appendToFile(fileName);
		readFile(fileName);
	}

	private static void readFile(String fileName) {
		// TODO Auto-generated method stub
		FileReader fr = new FileRader(filename);
		BufferedReader br = new BufferedReader(filename);
		String input;
		
		input = br.readLine();
		while(input!= null) {
			
		}
		
	}

	private static void appendToFile(String fileName) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			
		}
	}

}
