package serialiazable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialiazable 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		{
			FileInputStream fi=new FileInputStream("E:\\student.txt");
			ObjectInputStream ag=new ObjectInputStream(fi);
			Object o=ag.readObject();
			Student arun=(Student)o;
			System.out.println(arun.id+" "+arun.name+" "+arun.marks);
		}
	}
}










