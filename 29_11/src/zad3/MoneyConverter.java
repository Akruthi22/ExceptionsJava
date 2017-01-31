package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MoneyConverter {
	
	private final String filename = "src\\zad3\\currency.txt";
	
	private double readCourse(String currency) {
		double course = 0.0;
		String temp = "";
		try {
			Scanner sc = new Scanner(new File(this.filename));
			while(sc.hasNextLine()) {
				temp = sc.nextLine();
				if(temp.contains(currency)) {
					break;
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		String[] myStrArr = temp.split("\t");
		String[] myCourseArr = myStrArr[0].split(" ");
		course = Double.parseDouble(myStrArr[1].replace(",", ".")) / Double.parseDouble(myCourseArr[0]);
		return course;
	}
	
	public double convert(double money, String to) {
		return money / this.readCourse(to);
	}
	
	public double convert(double money, String to, String from) {
		double courseTo = this.readCourse(to);
		double courseFrom = this.readCourse(from);
		return money * courseFrom / courseTo;
	}

}
