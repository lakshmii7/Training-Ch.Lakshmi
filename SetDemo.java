package Set;

import java.util.HashSet;

public class SetDemo {
  public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
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
	
	System.out.println(hs);
}
}
