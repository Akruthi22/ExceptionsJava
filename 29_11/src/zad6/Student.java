package zad6;

public class Student {
	
	private int index; 
	private String name; 
	private String secondName; 
	private String course; 
	private double averageMark;
	
	public Student() {
	}
	
	public Student(int index, String name, String secondName, String course, double averageMark) {
		this.index = index;
		this.name = name;
		this.secondName = secondName;
		this.course = course;
		this.averageMark = averageMark;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
}
