package com.jnit;

public class Finally {
 public static void main(String[] args) {
	 int d[]=new int[5];
	 
	 try {
	 d[7]=75;
	 
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 e.printStackTrace();
	 }
	 finally {
		System.out.println("Finally block is always excuted");

	}
	 }
}

