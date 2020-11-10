package files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputExample {
 public static void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream("E:\\lakshmi.txt");
	int i=fi.read();
	System.out.println(i);
	System.out.println((char)i);}
}
