package polymorphismtest;

public class ParentClass {

	int salary = 2000;
	
	public void sal() {
		
		System.out.println("Salary of employee is: " +salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass obj = new ParentClass();
		obj.sal();
	}

}
