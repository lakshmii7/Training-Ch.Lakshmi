package com.jnit;
public class Stringequalsignorecase {

	public static void main(String[] args) {
		String str1= new String("Java");
		String str2= new String("Python");
		String str3= new String("JAVA");
		System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
		System.out.println("str1 equals to str3:"+str1.equalsIgnoreCase(str3));
		System.out.println("str1 equals to Welcome:"+str1.equalsIgnoreCase("Welcome"));
		System.out.println("str1 equals to Java:"+str1.equalsIgnoreCase("Java"));
		System.out.println("str2 equals to Python:"+str2.equalsIgnoreCase("Python"));

	}

}
