package encapsulation;

public class ATM {

	private int accountno;
	private int pinno;
	private int balance;
	
	public void setData(int accountno, int pinno, int balance) {
		this.accountno=accountno;
		this.pinno=pinno;
		this.balance=balance;
	}
	
	public void getData() {
		
		System.out.println("Balance Amount: "+balance);
	}
}
