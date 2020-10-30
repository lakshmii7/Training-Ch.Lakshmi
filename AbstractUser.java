abstract class  Vehicles
{
	public abstract void price();
	public abstract void noOfWheels();
	public abstract void models();
	 
}
abstract class RoyalEnfield extends Vehicles {
	public void price()
	{
		System.out.println("1.6lakhs");
	}
	public void  noOfWheels()
	{
		System.out.println("Two wheels");
	}
}
 class  EnfieldModels extends  RoyalEnfield {
	public void models() {
		System.out.println("classic 350");
		System.out.println("Interceptor 600");
		System.out.println("Enfield classic 500");
	}
}
public class AbstractUser {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
    EnfieldModels r=new EnfieldModels();   
r.noOfWheels();
r.price();
r.models();
	}

}
