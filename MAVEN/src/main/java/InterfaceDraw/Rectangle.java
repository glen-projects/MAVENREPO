package InterfaceDraw;

public class Rectangle implements Draw, Print{

	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	
	public void printmethod() {
		System.out.println("Printing Rectangle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rt=new Rectangle();
		rt.draw();
		rt.printmethod();
	}

}
