package comparator.demo;

import java.util.Comparator;

public class EmpSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSal() - o2.getSal();
	}
	
}
