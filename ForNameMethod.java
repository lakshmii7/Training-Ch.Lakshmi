package motivity;

class Test 
{
	static
	{
		System.out.println("this is static block");
	}
}
class Java
{
	static
	{
		System.out.println("java block");
	}

Java()
{
	System.out.println("java constructor");
}
}

public class ForNameMethod {
public static void main(String[] args) throws Exception {
	System.out.println("static method");
	Class c=Class.forName(args[0]);
	System.out.println( c.getName());
	c.newInstance();
	}
}
