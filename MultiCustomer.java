class Banks
{
	String Accname="rohan";
	int accno=898998;
	public  void details()
	{
		System.out.println("Accname:"+"Accname+\n accno:"+accno);
	}
}
class Deposits extends Banks{
	double bal=100;
	public void deptamt() {
		System.out.println("Deposit amount"+bal);
		
	}
}
class Withdrawl extends Deposits {
	double amt=200;
	public void withamt() {
		if(amt>bal) {
			System.out.println("you cannot withdrawl balance exceeds");
		}
		else {
			System.out.println("collect amount");
		}
	}
}
public class MultiCustomer {
	public static void main(String args[])
	{
		Deposits d1=new Deposits();
		d1.details();
		d1.deptamt();
		
		
	}

}

