package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemapdemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		
	hm.put(1023,"rahul");
	hm.put(1024, "shiva");
	hm.put(1023,"rahul");
	hm.put(1026,"divya");
     hm.put(1025,"jeeva");
	System.out.println(hm);
	
	Set<Map.Entry<Integer,String>> s=hm.entrySet();
	
	for(Map.Entry<Integer,String> x:s)
	{
		System.out.println(x.getKey()+"  "+x.getValue());
	}
	
	
	
	}
}