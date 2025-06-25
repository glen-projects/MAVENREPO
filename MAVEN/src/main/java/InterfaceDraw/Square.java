package InterfaceDraw;

public class Square implements Draw, Print{

	public void draw() {
		System.out.println("Drawing Square");
	}
	
	public void printmethod() {
		System.out.println("Printing Square");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		sq.draw();
		sq.printmethod();
	}

}
