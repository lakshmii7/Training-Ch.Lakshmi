class Vehicle {
	String  fuel()
	{
		return "Petrol";
		
	}
}
class Cars extends Vehicle {
	String fuel()
	{
		return "CNG";
		
				}
}
class Bike extends Vehicle {
	//No updation..
}
class Bus extends Vehicle {
	String fuel() {
		return "Diesel";
		
	}
}
public class HierarchicalInheritance {
 public static void main(String args[]) {
	 Cars c=new Cars();
	 String cf=c.fuel();
	 System.out.println("Car fuel type: "+cf);
	Bike b=new Bike();
	System.out.println("Bike fuel type :"+b.fuel());
 }
}
