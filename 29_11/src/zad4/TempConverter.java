package zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TempConverter {
	public double toKelvin(double temp) {
		return temp + 273.15;
	} 
	
	public double toFahrenheit(double temp) {
		return 32 + (9 / 5) * temp;
	} 
	
	public double[] readTemp(String filename) throws FileNotFoundException {
		File f = new File("src\\zad4\\tempC.txt");
		Scanner sc = new Scanner(f);
		double[] ret = new double[this.countLines("src\\zad4\\" + filename)];
		int i = 0;
		while(sc.hasNextLine()) {
			ret[i] = Double.parseDouble(sc.nextLine().replace(",", "."));
			i++;
		}
		return ret;
	}
	
	public void writeTemp(double[] temp) {
		try {
			PrintWriter pwK = new PrintWriter(new FileOutputStream(new File("src\\zad4\\tempK.txt")));
			PrintWriter pwF = new PrintWriter(new FileOutputStream(new File("src\\zad4\\tempF.txt")));
			for(int i = 0; i < temp.length; i++) {
				pwK.println(this.toKelvin(temp[i]));
				pwF.println(this.toFahrenheit(temp[i]));
			}
			pwK.close();
			pwF.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	private int countLines(String filename) throws FileNotFoundException {
		File f = new File(filename);
		Scanner sc = new Scanner(f);
		int i = 0;
		while(sc.hasNextLine()) {
			i++;
			sc.nextLine();
		}
		return i;
	}
}
