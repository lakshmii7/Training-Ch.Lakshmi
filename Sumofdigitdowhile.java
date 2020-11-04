package com.jnit;

public class Sumofdigitdowhile
{
	public static void main(String[] args)
	{
		int n=123456;
		int sum=0;
		do
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}while(n>0);
		System.out.println(sum);
			
		
	}

}
