package comparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpDemo {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(103, "Arpit", 20000));
		al.add(new Employee(102, "Neha", 10000));
		al.add(new Employee(101, "Abhishek", 4000));
		al.add(new Employee(104, "Gaurav", 3000));
		
		System.out.println("Before Sorting");
		for(Employee emp : al) {
			System.out.println(emp);
		}
		
		Collections.sort(al, new EmpIdComparator());
		
		System.out.println("\nAfter Sorting");
		for(Employee emp : al) {
			System.out.println(emp);
		}
		
	}
}
