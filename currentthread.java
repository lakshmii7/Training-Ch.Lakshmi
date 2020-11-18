package com.motivity;

public class currentthread extends Thread{
	public void run() {
		System.out.println("arun................."+Thread.currentThread().getName());
	}
 public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
  currentthread t=new currentthread();
  currentthread t1=new currentthread();
  System.out.println(t.getName());
 System.out.println(t1.getName());
 t.setName("Avengers");
 t1.setName("Marvels");
t.start();
t1.start();
 }
 
 
 
 
 
}
