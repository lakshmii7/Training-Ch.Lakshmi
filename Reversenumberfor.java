package com.jnit;

public class Reversenumberfor
 {
   public static void main(String[] args) {

   int n=123,x=0;
   for(;n>0;n=n/10)
   {
	   int rem=n%10;
	   x=x*10+rem;
   }
   
   System.out.println(x);
   }


   

}
