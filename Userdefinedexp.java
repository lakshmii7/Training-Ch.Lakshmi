package com.jnit;

class Voting extends Exception {
	Voting(String s) {
		super(s);
		}
	}

public class Userdefinedexp {
 public static void main(String[] args) throws Voting{
	int age=18;
	if(age>=18) {
		System.out.println(" eligigble for voting");}
	else {
		throw new Voting("not eligoble for voting");
	}
}
}
