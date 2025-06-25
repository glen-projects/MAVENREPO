package polymorphismtest;

public class ChildClass extends ParentClass{

	int bonus=1000;
	
	public void sal() {
		System.out.println("Salary of manager: " +(bonus+salary));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass obj=new ChildClass();
		obj.sal();
	}

}
