package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sentence {
	
	private final String path = "src\\zad1\\";
	
	public String readSentence(String filename) {
		File f = new File(this.path + filename);
		String temp = "";
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				temp += sc.nextLine() + " ";
			}
			
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1, temp.length() - 1);
			temp = (temp.substring(temp.length() - 1).equals(".")) ? temp : temp + ".";
		} catch(FileNotFoundException e) {
			System.out.println("Nie odnaleziono podanego pliku!");
		}
		return temp;
	}
}
