package main;

import java.util.Scanner;

import zad1.Zad1;
import zad2.Square;
import zad3.Division;
import zad4.*;
import zad6.WrongAgeException;
import zad7.*;

public class Poniedzialek_28_11 {

	public static void main(String[] args) {
		/*Zad1 z1 = new Zad1();
		int n = 4;
		
		try {
			System.out.println(z1.getIndex(11));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Brak komorki pod indeksem: " + e.getMessage());
		}
		
		try {
			System.out.println("Pierwiastek z " + n + " = " + Square.square(n) );
		} catch(IllegalArgumentException e) {
			System.out.println("Podano nieprawidlowy argument: " + e.getMessage());
		}
		
		try {
			System.out.println(Division.divide(8, 0));
		} catch(IllegalArgumentException e) {
			System.out.println("Wystapil blad: " + e.getMessage());
		}
		System.out.println("*** KONIEC ***");
		
		
		
		ReadNumbers rn = new ReadNumbers();
		
		System.out.println("Twoja liczba to: " + rn.readDouble());
		
		*/
		
		Person p = new Person();
		try {
			p.setAge(150);
		} catch(WrongAgeException e) {
			System.out.println("Wystapil blad: " + e.getMessage());
		}
		System.out.println("Wiek to: " + p.getAge());
		
		
	}

}
