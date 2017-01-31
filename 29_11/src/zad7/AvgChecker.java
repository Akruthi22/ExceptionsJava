package zad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AvgChecker {

	private final String path = "src//zad7//";

	public void Avg(String filename) {

		File f = new File(this.path + filename);
		String[] line = new String[this.countLines()];
		double[] avgNumb = new double[this.countLines()];
		int i = 0;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				line = sc.nextLine().split("\t");
				avgNumb[i] = (Double.parseDouble(line[1]) + Double.parseDouble(line[2]) + Double.parseDouble(line[3])) / 3;
				i++;
			}
			
			sc.close();

			PrintWriter avg = new PrintWriter(new FileOutputStream(new File("src\\zad7\\avg.txt")));

			for (int j = 0; j < this.countLines(); j++) {
				avg.println(avgNumb[j]);
			}

			avg.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private int countLines() {

		File f = new File("src//zad7//marks.txt");

		int counter = 0;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				counter++;
				sc.nextLine();
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return counter;
	}

}
