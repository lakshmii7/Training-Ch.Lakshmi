package files;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class chararraywriter {
 public static void main(String[] args) throws Exception {
	CharArrayWriter out=new CharArrayWriter();
	out.write("motivity labs is in kondapur");
	FileWriter f1=new FileWriter("E:\\jnit.txt");
	
	out.writeTo(f1);
	
	
	f1.close();;
}
}
