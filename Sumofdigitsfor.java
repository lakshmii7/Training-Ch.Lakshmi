package com.jnit;

public class Sumofdigitsfor {
  public static void main(String[] args)
  {
	int n=123456;
	int sum=0;
	for(;n>0;n=n/10) {
		int rem=n%10;
		sum=sum+rem;
	}
	System.out.println(sum);
	
}
}
