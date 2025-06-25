package polymorphism;

public class Employee {

	int salary=30000;
	
	public void salary() {
		System.out.println("Salary for the employee is: " +salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em= new Employee();
		em.salary();
	}

}
