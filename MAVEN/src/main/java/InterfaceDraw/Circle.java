package InterfaceDraw;

public class Circle implements Draw, Print {

	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public void printmethod() {
		System.out.println("Printing Circle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cl=new Circle();
		cl.draw();
		cl.printmethod();
	}

}
