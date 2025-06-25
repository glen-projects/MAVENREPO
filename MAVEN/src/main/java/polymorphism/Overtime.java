package polymorphism;

public class Overtime extends Employee{

	int overtimeamount=1000;
	
	public void salary() {
		
		System.out.println("Salary after including overtime is: " +(salary+overtimeamount));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em3=new Overtime();
		em3.salary();
	}

}
