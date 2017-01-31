package zad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LengthChecker {

	private final String path = "src//zad5//";

	private String[] readFile(String filename) {

		File f = new File(this.path + filename);
		String[] str = new String[this.countLines()];
		int i = 0;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				str[i] = sc.nextLine();
				i++;
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return str;
	}

	private int countLines() {

		File f = new File(this.path + "words.txt");
		int count = 0;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				count++;
				sc.nextLine();
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;
	}

	public void make(int len) throws FileNotFoundException {

		String name = "word_" + len;

		PrintWriter pwr = new PrintWriter(new FileOutputStream(new File(this.path + name)));

		for (int i = 0; i < this.countLines(); i++) {
			if (this.readFile("words.txt")[i].length() >= len) {
				pwr.println(this.readFile("words.txt")[i]);
			}
		}
		pwr.close();
	}

}
