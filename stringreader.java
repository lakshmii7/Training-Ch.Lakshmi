package files;

import java.io.Exception;
import java.io.StringReader;

public class stringreader {
 public static void main(String[] args) throws Exception {
	String stg="motivity labs";
	StringReader reader=new StringReader(stg);
	int k=0;
	while((k=reader.read())!=-1) {
		System.out.print((char)k);
	}
}
}
