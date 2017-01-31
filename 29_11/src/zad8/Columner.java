package zad8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Columner {
	
	final String path = "src//zad8//data.txt";
	
	public void odczyt(){
		
		File f = new File(this.path);
		String [] line = new String [2];
		
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()){
				line = sc.nextLine().split("\t");
				
				System.out.println(line[0]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
