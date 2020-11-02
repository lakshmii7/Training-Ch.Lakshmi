package Map;
import java.util.PriorityQueue;

public class Priorityqueuedemo {
	public static void main(String[] args) {
		
		 PriorityQueue<Object	> a1=new PriorityQueue<>();
		  a1.add("DELL");
		  a1.add("bangalore");
		  a1.add("apti");
		  a1.add("adp");
		  a1.add("swiss");
		  
		  System.out.println(a1.peek());
		  System.out.println(a1.poll());
		  while(a1.peek()!=null)
		  {
			  System.out.println(a1.poll());
		  }
}
}