class Bank
{
	String Accname="Rohan";
	int accno=8989899;
}
class Deposit extends Bank {
	double bal=100;
}
public class SingleDeposit {

	public static void main(String[] args) {
		Deposit d1=new Deposit();
		System.out.println("account name is:"+d1.Accname);
		System.out.println("account number is:"+d1.accno);
		System.out.println("deposit amount is:"+d1.bal);
				

	}

}
