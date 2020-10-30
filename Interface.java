public interface Company
{
 void noofemployees();
 void salary();
 void locations();
}

class IBM implements Company
{
public void noofemployees()
{
System.out.println("10000");
}
public void salary()
{
	System.out.println("15000");
}
public void locations()
{System.out.println("5");
}
class Infosys implements Company
{
	public void noofemployees()
{
System.out.println("10000");
}
public void salary()
{
	System.out.println("15000");
}
public void locations()
{System.out.println("5");
}
 public class  InterfaceCompany {
	public static void main(String args[])
{
IBM i=new IBM();
i.noofemployees();
i.salary();
i.locations();
Infosys s=new Infosys();
s.noofemployees();
s.salary();
s.locations();

}
 }








