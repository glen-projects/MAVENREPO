package polymorphism;

public class Manager extends Employee {

	int bonus=5000;
	
	public void salary() {
		System.out.println("Salary for Manager is: "+(salary+bonus));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1=new Manager();
		em1.salary();
	}

}
