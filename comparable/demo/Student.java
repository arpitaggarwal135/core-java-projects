package comparable.demo;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private int rank;
	
	public Student(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	
	@Override
	public int compareTo(Student obj) {
		if(this.id < obj.id) {
			return 1;
		} else if(this.id > obj.id) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
}
