package motivity;

class Task extends Thread implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("i value is :"+i);
		}
	}
}

public class Withthread {
 public static void main(String[] args) {
	Task t=new Task();
	Thread h=new Thread(t);
	t.start();
	for(int x=0;x<20;x++)
		
	{
		System.out.println("x value is :"+x);
	}
}
}
