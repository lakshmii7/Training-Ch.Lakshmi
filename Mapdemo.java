package Map;

import java.util.HashMap;

public class Mapdemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
	hm.put(1023,"rahul");
	hm.put(1024, "shiva");
	hm.put(1023,"rahul");
	hm.put(1026,"divya");

	hm.put(1025,"jeeva");
	System.out.println(hm);
}
}