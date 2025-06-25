package Interface;

public class Videocall implements Whatsappcall{

	public void connect() {
		System.out.println("Connecting video call");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting from video call");
	}
	
	public void mute() {
		System.out.println("Call is on mute");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Videocall vc=new Videocall();
		vc.connect();
		vc.disconnect();
		vc.mute();
	}

}
