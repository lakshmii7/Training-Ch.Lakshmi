package com.jnit;

public class Nullpointerexp {
public static void main(String[] args) {
	String str=null;
	try {
		System.out.println(str.length());
	}
	catch(NullPointerException n) {
		System.out.println("Nullpointerexception.....");
		System.out.println(n);
	}
	
}
}
