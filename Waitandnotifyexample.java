package multithreading;


class Customer
{
	int amount=10000;
	synchronized void withdrawal(int amount) 
	{
		System.out.println("Going to withdrawal..");
		if(this.amount<amount)
		{
			System.out.println("Less balance go and deposit");
			try
			{
				wait();
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit");
	   this.amount+=amount;
		System.out.println("deposit done");
		notify();
		
	}
}
public class Waitandnotifyexample {
public static void main(String[] args) {
	Customer ravi=new Customer();
	new Thread() 
	{
		public void run()  
		{
			ravi.withdrawal(15000);
			}
	}.start();
	new Thread() {
		public void run() 
		{
			ravi.withdrawal(2000);
		}
	}.start();
}
}