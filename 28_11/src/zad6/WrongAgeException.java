package zad6;

public class WrongAgeException extends Exception {
	public WrongAgeException() {
		super("Wrong age exception.");
	}
	
	public WrongAgeException(String message) {
		super(message);
	}
}
