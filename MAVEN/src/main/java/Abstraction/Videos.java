package Abstraction;

public class Videos extends Google {

	void search() {
		System.out.println("Searching from Videos");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Videos vi=new Videos();
		vi.search();
		vi.messagedisplay();
	}

}
