package zad8;
import zad6.*;
import zad7.*;

public class People {
	private Person[] list;
	private int index = 0;
	private final String[] allowedEyes = { "green", "brown", "blue", "black" }; 
	private final String[] allowedHair = { "blond", "brown", "black", "red" };
	
	public People(int n) {
		this.list = new Person[n];
	}
	
	public void addPerson(Person person) throws FullListException {
		if(this.isFullList()) {
			throw new FullListException();
		}
		this.list[this.index] = person;
	}
	
	public void addPerson(String name, String secondName, int age, String hair, String eyes, double shoe) 
			throws FullListException, WrongAgeException, BadHairException {
		if(this.isFullList()) {
			throw new FullListException();
		}
		
		Person p = new Person();
		p.setName(name);
		p.setSecondName(secondName);
		p.setAge(age);
		
		if(this.isPresentElem(this.allowedHair, hair)) {
			p.setHair(hair);
		} else {
			throw new BadHairException();
		}

	}
	
	public boolean isFullList() {
		return this.index == this.list.length - 1;
	}
	
	private boolean isPresentElem(String[] table, String arg) {
		boolean f = false;
		
		for(int i = 0; i < table.length; i++) {
			if(table[i].equalsIgnoreCase(arg)) {
				f = true;
			}
		}
		
		return f;
	}
}
