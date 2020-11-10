package files;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Sequenceinputstream {
   public static void main(String[] args) throws Exception {
	FileInputStream input1=new FileInputStream("E:\\lakshmi.txt");
	FileInputStream input2=new FileInputStream("E:\\jnit.txt");
	SequenceInputStream inst=new SequenceInputStream(input1,input2);
	 int j=inst.read();
	 while(j!=-1)

  {
	System.out.println((char)j);
	j=inst.read();
  }
  }
}
