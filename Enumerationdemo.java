package List;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationdemo {
	public static void main(String[] args) {
		
		 Vector<Integer> a1=new Vector<Integer>();
		  a1.add(34);
		  a1.add(56);
		  a1.add(90);
		  a1.add(78);
		  a1.add(34);
		  a1.add(23);
		  a1.add(12);
		  a1.add(55);
		  a1.add(89);
		  Enumeration<Integer> ee=a1.elements();
		  while(ee.hasMoreElements()) 
		  {
			  System.out.println(ee.nextElement());
		  }
   System.out.println(a1.capacity());
    System.out.println(a1.firstElement());
	System.out.println(a1.lastElement());
	System.out.println(a1.get(5));
	System.out.println(a1.hashCode());
	a1.set(1,10);
	
	System.out.println(a1.remove(2));
	System.out.println(a1);
	
	
	
	
	
	}
	}
