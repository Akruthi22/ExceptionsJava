package zad2;

public class Square {

	public static double square(int n) throws IllegalArgumentException {
		if(n < 0) {
			throw new IllegalArgumentException(new Integer(n).toString());
		}
		return Math.sqrt(n);
	}
}
