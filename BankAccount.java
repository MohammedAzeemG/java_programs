package oopsTasks;

public class BankAccount {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAcnum(1000135);
		System.out.println("Account no: "+ac.getAcnum());
		ac.setDep(10000);
		System.out.println("Deposite amount: "+ac.getDep());
		ac.setwidrl(5000);
		System.out.println("Withdrawn amount: "+ac.getwidrl());
		System.out.println("Balance amount: "+ac.getBal());
		}

}
class Account{
	private int ac_num;
	private float balance;
	int deposite,withdraw;
	void setAcnum(int an) {
		ac_num=an;
	}
	int getAcnum() {
		return ac_num;
	}
	public void setDep(int d) {
	    deposite=d;
		balance=balance+d;
	}
	int getDep() {
		return deposite;
	}
	public void setwidrl(int w) {
		withdraw=w;
		balance=balance-w;
	}
	int getwidrl() {
		return withdraw;
	}
	float getBal() {
		return balance;
	}
}