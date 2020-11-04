package com.jnit;

public class Reversenumberwhile 
{
public static void main(String[] args) 
{
	int n=123,x=0;
	while(n>0)
	{
		int rem=n%10;
		x=x*10+rem;
		n=n/10;
		
}
	System.out.println(x);
}
}
