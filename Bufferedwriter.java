package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {
 public static void main(String[] args) throws Exception {
	FileWriter writer=new FileWriter("E:\\demo.txt");
	BufferedWriter buffer=new BufferedWriter(writer);
	buffer.write("motivity labs");
	buffer.close();
 
 
 }
}
