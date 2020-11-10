package files;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter p=new PrintWriter(System.out);
	String s="This is printwriter";
	p.write(s);
	p.print(s);
	p.close();
}
}
	