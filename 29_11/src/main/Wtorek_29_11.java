package main;

import java.io.FileNotFoundException;

import zad6.University;
import zad8.Columner;

public class Wtorek_29_11 {
	public static void main(String[] args) throws FileNotFoundException {
		/*File f = new File("src\\main\\test.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		File f2 = new File("test2.txt");
		FileOutputStream fos = new FileOutputStream(f2);
		PrintWriter pw = new PrintWriter(fos);
		
		pw.println("XX Przyk³adowy tekst pochodz¹cy z naszej aplikacji.");
		pw.close();*/
		/*
		Sentencer s = new Sentencer();
		System.out.println(s.readSentence("test.txt"));
		
		s.writeSentence("mySentence.txt", "Przyk³adowy tekst");*/
		
//		MoneyConverter mc = new MoneyConverter();
//		System.out.println(mc.convert(100, "EUR"));
//		
//		System.out.println(mc.convert(100, "EUR", "USD"));
//		
//		
//		TempConverter tc = new TempConverter();
//		double[] temp = tc.readTemp("tempC.txt");
//		tc.writeTemp(temp);
		
//		AvgChecker avg = new AvgChecker();
//		avg.Avg("marks.txt");
		
//		LengthChecker lgt = new LengthChecker();
//		lgt.make(9);
		
//		University uv = new University();
//		uv.getStudent(123);
		
		Columner c = new Columner();
		c.odczyt();
	}
}
