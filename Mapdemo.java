package Map;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Mapdemo {
	public static void main(String[] args) {
		TreeMap<Integer,String>hm =new TreeMap<Integer,String>();
		
		
	hm.put(1023,"rahul");
	hm.put(1024, "shiva");
	hm.put(1023,"rahul");
	hm.put(1026,"divya");
	hm.put(1025,"jeeva");
	System.out.println(hm);
	
	Set  s=hm.entrySet();
	Iterator i=s.iterator();
	
	while(i.hasNext()) {
		Map.Entry m=(Map.Entry)i.next();
		System.out.println(m.getKey()+"  "+m.getValue());
	}
}
}