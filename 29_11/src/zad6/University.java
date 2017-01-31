package zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class University {

	private final String path = "src//zad6//students.txt";

	public void getStudent(int index) {

		File f = new File(this.path);
		String [] line = new String[4];

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				line = sc.nextLine().split("/t");
				
				System.out.println(line[0]);
				
				if (Integer.parseInt(line[0]) == index) {
					System.out.println("Student: " + line[1] + " " + line[2]);
					break;
				} else {
					System.out.println("Nie ma takiego studenta");
				}
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private boolean isStudentExists(int index) {

		File f = new File(this.path);
		String[] line = new String[this.lineCounter()];
		boolean isExist = false;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				line = sc.nextLine().split("/t");
				if (Integer.parseInt(line[0]) == index) {
					isExist = true;
					break;
				}
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return isExist;
	}

	private int lineCounter() {

		File f = new File(this.path);
		int i = 0;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {
				i++;
				sc.nextLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return i;
	}

}
