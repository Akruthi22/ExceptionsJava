package zad3;

public class Division {
	public static double divide(int a, int b) throws IllegalArgumentException {
		if(b == 0) {
			 throw new IllegalArgumentException("Divider is 0."); 
		}
		return a / b;
	} 
	
	public static double divide(double a, double b) throws IllegalArgumentException {
		if(b == 0) {
			 throw new IllegalArgumentException("Divider is 0."); 
		}
		return a / b;
	}
}
