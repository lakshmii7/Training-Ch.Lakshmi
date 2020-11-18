package motivity;

import java.util.Scanner;

class AliveEx extends Thread
{
	int x,y;
 public void run() 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter x,y values");
	 x=sc.nextInt();
	 y=sc.nextInt();
	 
 }
	
}

public class Threadjoin {

	public static void main(String[] args) throws InterruptedException {
		AliveEx a1=new AliveEx();
		a1.start();
		a1.join();
		System.out.println("Sum ="+(a1.x+a1.y));
	}
}
