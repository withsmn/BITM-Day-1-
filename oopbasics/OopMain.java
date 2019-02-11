package oopbasics;

import java.util.ArrayList;

public class OopMain {

	public static void main(String[] args) {
		Student s1 = new Student("Hasib",20,235566,"MAD");
		Student s2 = new Student("Masud",21,239988,"MAD");
		Student s3 = new Student("Shajib",22,232588,"MAD");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
	}

}
