package programs.main;

public final class ImmutableClass {
	
	private String name;
	private int rollNo;
	private static String  iName = "Ashok IT";
	private String mobNo;
	
	public ImmutableClass(String name, int rollNo, String mobNo) {
		this.name = name;
		this.rollNo = rollNo;
		this.mobNo = mobNo;
	}
	
	public ImmutableClass modifyName(String name) {
		if(name.equals(this.name))
			return this;
		else
			return new ImmutableClass(name, rollNo, mobNo);
	}
	
	public ImmutableClass modifyRollNo(int rollNo) {
		if(this.rollNo == rollNo)
			return this;
		else
			return new ImmutableClass(name, rollNo, mobNo);
	}
	
	public ImmutableClass modifyMobNo(String mobNo) {
		if(mobNo.equals(this.mobNo))
			return this;
		else
			return new ImmutableClass(name, rollNo, mobNo);
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Institute Name : "+iName);
		System.out.println("Mob No : "+mobNo);
		System.out.println("Hashcode : "+this.hashCode());
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ImmutableClass obj1 = new ImmutableClass("Arpit", 10, "1234");
		obj1.display();
		ImmutableClass obj2 = obj1.modifyName("Abhishek");
		obj2.display();
		ImmutableClass obj3 = obj1.modifyRollNo(20);
		obj3.display();
		ImmutableClass obj4 = obj1.modifyMobNo("4321");
		obj4.display();
	}
	
}
