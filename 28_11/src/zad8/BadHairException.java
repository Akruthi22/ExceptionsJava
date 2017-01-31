package zad8;

public class BadHairException extends Exception {
	public BadHairException() {
		super("This hair is not allowed.");
	}
	
	public BadHairException(String message) {
		super(message);
	}
}
