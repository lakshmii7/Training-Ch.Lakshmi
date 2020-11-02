package Set;

import java.util.LinkedHashSet;

public class Linkedhashset {
public static void main(String[] args) {
	LinkedHashSet<String> hs=new LinkedHashSet<String>();
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
}
}
