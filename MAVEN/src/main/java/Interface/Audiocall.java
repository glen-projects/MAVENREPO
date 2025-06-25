package Interface;

public class Audiocall implements Whatsappcall {

	public void connect() {
		System.out.println("Connecting to Audio call");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting from audio call");
	}
	
	public void mute() {
		System.out.println("Call is on mute");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audiocall ac=new Audiocall();
		ac.connect();
		ac.disconnect();
		ac.mute();
	}

}
