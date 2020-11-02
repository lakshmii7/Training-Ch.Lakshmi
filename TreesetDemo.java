package Set;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		
	
	TreeSet<String> hs=new TreeSet<String>();
	hs.add("F");
	hs.add("R");
	hs.add("E");
	hs.add("T");
	hs.add("M");
	hs.add("S");
	hs.add("D");
	hs.add("W");
	hs.add("");
	hs.add("F");
	hs.add("N");
	hs.add("");
	
	System.out.println(hs);
	System.out.println(hs.headSet("M",true));
	}
}
