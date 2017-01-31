package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StudentCouncil {

    private final static Random RANDOM = new Random();

    private final List<String> students;

    private String leader;

    public StudentCouncil() {
        this.students = new ArrayList<String>();
    }

    public StudentCouncil(List<String> students) {
        this.students = students;
    }

    public List<String> getStudents() {
        return new ArrayList<String>(this.students);
    }

    public boolean addStudent(String name) {
        return students.add(name);
    }

    public void removeStudent(String name) {
        this.students.remove(name);
    }

    public String getLeader() {
        if (this.students.isEmpty()) {
            throw new IllegalStateException("No leader!");
        }
        if (this.leader == null) {
            electNewLeader();
        }
        return this.leader;
    }

    public void electNewLeader() {
        if (this.students.isEmpty()) {
            throw new IllegalStateException("No students to choose from.");
        } else {
            leader = students.get(RANDOM.nextInt() % students.size());
        }
    }
    
    public List<String> getSortedStudents() {
        List<String> copy = new ArrayList<String>(this.students);
        Collections.sort(copy);
        return copy;
    }
}
