package com.jnit;

public class Reversenumberdowhile {
  public static void main(String[] args) {
	 int n=123,x=0; 
	 do 
	 {
		 int rem=n%10;
		 x=x*10+rem;
		 n=n/10;
	 }while(n>0);
	 System.out.println(x);
	 }
}

