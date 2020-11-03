package List;

import java.util.LinkedList;

public class Linkedlist1 {
 public static void main(String[] args) {
	LinkedList<Integer> l1=new LinkedList<Integer>();
	
		l1.add(15);
		l1.add(25);
		l1.add(76);
		l1.add(43);
		l1.add(46);
		l1.add(5);
		l1.add(9);
		l1.add(45);
		l1.add(76);
		l1.add(23);
		l1.add(8);
		
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			for(int j=i+1;j<l1.size();j++) {
				if(l1.get(i)==l1.get(j)) {
					System.out.println(l1.get(i));
				}
			}
		}
	
	
	}
	 

}
	 
	 
	 
	 
	 


