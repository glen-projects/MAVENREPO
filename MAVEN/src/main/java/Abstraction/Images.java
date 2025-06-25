package Abstraction;

public class Images extends Google {

	void search() {
		System.out.println("Searching from Images");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Images im=new Images();
		im.search();
		im.messagedisplay();
	}

}
