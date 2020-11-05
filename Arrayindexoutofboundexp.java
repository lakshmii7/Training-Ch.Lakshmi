package com.jnit;

public class Arrayindexoutofboundexp {
 public static void main(String[] args) {
	int a=10,b=0,c;
	int d[]=new int[3];
	try 
	{
		d[3]=55;
	}
	catch(ArrayIndexOutOfBoundsException f)
	{
		System.out.println("Exception caught for array");
	
		System.out.println(f);
	try {
		c=a/b;
		
	}
  catch(Exception e)
	{
	 System.out.println("Exception is caught");
	
	}
 
 
 }
}
}
