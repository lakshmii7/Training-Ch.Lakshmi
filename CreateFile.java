package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try 
		{
			FileOutputStream ft=new FileOutputStream("E:\\lakshmi.txt");
			FileOutputStream fs=new FileOutputStream("E:\\jnit.txt");
			ft.write(65);
	         ft.close();	
	         fs.write(75);
	         fs.close();
		}
       catch(IOException e)
		{
    	   e.printStackTrace();
    	   
		}
	}

}
