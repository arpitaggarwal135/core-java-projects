package comparator.demo;

public class Employee {
	
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	
	
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getSal() {
		return sal;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
