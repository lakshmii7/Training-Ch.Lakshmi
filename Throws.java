
public class Throws {
public  void checkAge(int age) {
	if(age<18)
		throw new Exception("Not eligible for voting");
	else 
		System.out.println("Eligible for voting");
}
 public static void main(String[] args) {
	Throws obj=new Throws();
	obj.checkAge(12);
	System.out.println("end of program");
}
}

