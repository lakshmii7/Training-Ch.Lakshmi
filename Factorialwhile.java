package com.jnit;

public class Factorialwhile {
    public static void main(String[] args) {
		int n=5,fact=1;
		while(n>=1)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
