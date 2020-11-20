package multithreading;

public class Sleep extends Thread {
public void run() {
	for(int i=0;i<10;i++) 
	{
		try 
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(i);
	}
}
public static void main(String[] args) {
	Sleep x=new Sleep();
	x.start();
}
}
