package zad8;

public class FullListException extends Exception {
	public FullListException() {
		super("The list is full.");
	}
	
	public FullListException(String message) {
		super(message);
	}
}
