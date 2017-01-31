package zad5;
import java.util.*;

public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	
	public QuadraticEquation() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private int getNumber() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.printf("Podaj liczbe calkowita: ");
			n = sc.nextInt();
		} catch(InputMismatchException e) {
			
		}
		return n;
	}
	
	public double[] solve() throws ArithmeticException {
		// a*x^2 + b*x + c = 0;
		double[] ret;
		if(this.a == 0 && this.b == 0 && this.c == 0) {
			this.a = this.getNumber();
			this.b = this.getNumber();
			this.c = this.getNumber();
		}
		
		if(this.a == 0) {
			ret = new double[1];
			ret[0] = - this.c / this.b;
		} else {
			double delta = this.b * this.b - 4 * this.a * this.c;
			if(delta < 0) {
				throw new ArithmeticException("delta < 0");
			} else if(delta == 0) {
				ret = new double[1];
				ret[0] = - this.b / 2 * this.a;
			} else {
				double x1, x2;
				x1 = (- this.b + Math.sqrt(delta) ) / 2 * a;
				x2 = (- this.b - Math.sqrt(delta) ) / 2 * a;
				ret = new double[2];
				ret[0] = x1;
				ret[1] = x2;
			}
		}
		
		return ret;
	}
}
