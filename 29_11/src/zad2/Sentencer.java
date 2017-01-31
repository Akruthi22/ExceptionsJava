package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import zad1.*;

public class Sentencer extends Sentence {
	
	private final String path = "src\\zad2\\";
	
	public void writeSentence(String filename, String sentence) {
		File f = new File(this.path + filename);
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(f));
			pw.println(sentence);
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
