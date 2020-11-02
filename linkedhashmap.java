package Map;


import java.util.LinkedHashMap;

public class linkedhashmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		
	hm.put(1023,"rahul");
	hm.put(1024, "shiva");
	hm.put(1023,"rahul");
	hm.put(1026,"divya");

	hm.put(1025,"jeeva");
	System.out.println(hm);
}
}
