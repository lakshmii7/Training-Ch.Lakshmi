package com.jnit;

public class Stringindexoutofboundexp {
 public static void main(String[] args) {
	try {
		String str="exceptionhandling";
		System.out.println(str.length());
	    char c=str.charAt(0);
	    c=str.charAt(34);
	    System.out.println(c);
	}catch(StringIndexOutOfBoundsException s) {
		System.out.println("StringIndexoutofboundsexception !!!!");
		System.out.println(s);
	}
}
}
