package comparable.demo;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(103, "Arpit", 2));
		al.add(new Student(102, "Neha", 1));
		al.add(new Student(101, "Abhishek", 4));
		al.add(new Student(104, "Gaurav", 3));

		System.out.println("Before Sorting");
		for (Student s : al) {
			System.out.println(s);
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting");
		for (Student s : al) {
			System.out.println(s);
		}
		
		Collections.reverse(al);
		
		System.out.println("Reverse Order");
		for (Student s : al) {
			System.out.println(s);
		}
		

	}
}
