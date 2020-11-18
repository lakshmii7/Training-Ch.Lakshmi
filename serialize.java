package serialiazable;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable 
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}
public class serialize {

	public static void main(String[] args) throws IOException {
		 Student  arun=new Student(12879,"raviteja",456);
		 FileOutputStream fi=new FileOutputStream("E:\\student.txt");
		 ObjectOutputStream ot=new ObjectOutputStream(fi);
		 ot.writeObject(arun);
		 ot.flush();
		 ot.close();
	}

}
