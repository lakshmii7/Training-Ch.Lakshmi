class Restaurant
{
	void menu() {
		System.out.println("1.Idly\n2.Wada\n3.Poori\n4.Dosa");
	}
	
  void takeOrder(String order){
	System.out.println("Order given is "+order);
	}
	String serveOrder(){
	return "Dosa";
	}
	int bill(){
	return 45;
	}
	String payBill(int amount){
	System.out.print("The bill amount "+amount);
	return "paid";
	}
	}

public class RestaurantMethods 
{
	 public static void main(String args[])
	 {
	 Restaurant aishwarya=new Restaurant();
	 aishwarya.menu();
	 aishwarya.takeOrder("Dosa");
	 System.out.println("Order Served is: " + aishwarya.serveOrder());
	 System.out.println("Bill amount is: "+ aishwarya.bill());
	 System.out.println(" is " + aishwarya.payBill(aishwarya.bill()));
	}
}


