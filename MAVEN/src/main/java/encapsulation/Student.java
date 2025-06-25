package encapsulation;

public class Student {

	private String name;
	private int age;
	
	public void setData(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public void getData() {
		System.out.println("Name: " +name);
		System.out.println("Age: "+(age*2));
	}
}
