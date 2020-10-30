 interface Books{
	 void bookname();
	 void author();
	 void dateofborrowing();
 }
 class Java implements Books {
	 public void bookname()
	 {
		 System.out.println("Java Seventh edition");
		 
	 }
	 public void author()
	 {
		 System.out.println("Herbert");
	 }
	 public void dateofborrowing()
	 {
		 System.out.println("26th may 2020");
	 }
 }
class Sql implements Books{

	@Override
	public void bookname() {
		// TODO Auto-generated method stub
		System.out.println("Sql beginners");
		
	}

	@Override
	public void author() {
		// TODO Auto-generated method stub
		System.out.println("john viescas");
	}

	@Override
	public void dateofborrowing() {
		// TODO Auto-generated method stub
		System.out.println("17th may 2020");
	}
} 
 class Aptitude implements Books {

	@Override
	public void bookname() {
		// TODO Auto-generated method stub
		System.out.println("Aptitude Analysis");
	}

	@Override
	public void author() {
		// TODO Auto-generated method stub
		System.out.println("R.S.Aggarwal");
	}

	@Override
	public void dateofborrowing() {
		// TODO Auto-generated method stub
		System.out.println("19th june 2020");
	}
 }
	
public class IntefaceLibrarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Java j=new Java();
 j.bookname();
 j.author();
 j.dateofborrowing();
 Sql s=new Sql();
 s.bookname();
 s.author();
 s.dateofborrowing();
 Aptitude a=new Aptitude();
 a.bookname();
 a.author();
 a.dateofborrowing();
	}

}
