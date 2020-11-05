package com.jnit;

public class Arithmetcexception {
 public static void main(String[] args)
 {
 
	int a=10,b=0,c;
	try {
		c=a/b;
		System.out.println("This is try block");
	}
	  catch(ArithmeticException e) {
		  System.out.println("Exception is handled");
	  System.out.println(e);
	  }
}
}