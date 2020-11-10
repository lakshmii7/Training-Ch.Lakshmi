package files;
import java.io.CharArrayReader;

public class chararrayreader {
 public static void main(String[] args) throws Exception {
	char[] arr= {'t','e','c','h','n','o','l','o','g','y'};
	CharArrayReader reader=new CharArrayReader(arr);
	int k=0;
  while((k=reader.read())!=-1) {
	  char ch=(char) k;
	  System.out.print(ch  + ":  ");
	  System.out.println(k);;
	  
  }
 }
}
