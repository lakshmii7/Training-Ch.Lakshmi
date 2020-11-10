package files;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
 public static void main(String[] args) {
	try {
		FileWriter w=new FileWriter("E:\\output.txt");
		String content="Motivity labs";
		w.write(content);
		w.close();
	} catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
