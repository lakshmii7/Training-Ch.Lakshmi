package List;


import java.util.Vector;

public class Vectordemo {
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
		  System.out.println(a1);
		  
		  for(int x:a1) {
			 
		  
			  System.out.println(x);
		  }	}
}
