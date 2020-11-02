package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiteratordemo {
	public static void main(String[] args) {
		
		 ArrayList<Integer> a1=new ArrayList<>();
		  a1.add(34);
		  a1.add(56);
		  a1.add(90);
		  a1.add(78);
		  a1.add(34);
		  a1.add(23);
		  a1.add(12);
		  a1.add(55);
		  a1.add(89);
		  System.out.println(a1);
		  ArrayList<Integer> s1=new ArrayList<>();
		  s1.addAll(a1);
		  System.out.println(s1);
 System.out.println(s1.removeIf(n->(n%10)==0));
System.out.println(s1);
    ListIterator<Integer> it=a1.listIterator();
 while(it.hasNext()) {
	 System.out.println(it.next()+"  ");
 }
 s1.add(1,20);
 System.out.println(s1);
 s1.set(1,30);
 System.out.println(s1);
	}
}