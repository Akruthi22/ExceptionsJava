package zad1;

import java.util.Scanner;

public class Zad1 {
	
	int[] arr = new int[10];
	
	public Zad1() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < this.arr.length; i++) {
			System.out.printf("Podaj element arr[" + i + "] = ");
			this.arr[i] = sc.nextInt();
		}
	}
	
	public int getIndex(int n) {
		return this.arr[n];
	}
}
