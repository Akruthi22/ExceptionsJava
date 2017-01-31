package zad4;
import java.util.*;

public class ReadNumbers {
	private Scanner sc;
	
	public ReadNumbers() {
		if(this.sc == null) {
			this.sc = new Scanner(System.in);
		}
	}
	
	public double readDouble() {
		double ret = 0.0;
		try {
			System.out.printf("Podaj liczbe zmiennoprzecinkowa: ");
			ret = this.sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("Wystapil blad: " + e.getMessage());
		}
		return ret;
	}
	
	public int readInt() {
		int ret = 0;
		try {
			System.out.printf("Podaj liczbe calkowita: ");
			ret = this.sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Wystapil blad: " + e.getMessage());
		}
		return ret;
	} 
	
	public String readString() {
		String ret = "";
		System.out.printf("Podaj ci¹g znaków: ");
		ret = this.sc.nextLine();
		return ret;
	}
}
