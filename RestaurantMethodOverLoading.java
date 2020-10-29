class Restaurants
{
 void menu()
 {
 System.out.println("1.Idly\n2.Wada\n3.Dosa\n4.Poori");
 }
 void takeOrder(String order)
 {
 System.out.println("Order given is "+order);
 }
 void takeOrder(String order1,String order2)
 {
 System.out.println("Order given is "+order1+" and "+order2);
 }
 void takeOrder(String order1,String order2,String order3)
 {
 System.out.println("Order given is "+order1+" and "+order2+" and "+order3);
 }
}

public class RestaurantMethodOverLoading
 {
 public static void main(String args[])
 {
 Restaurants aishwarya=new Restaurants();
 aishwarya.menu();
 aishwarya.takeOrder("Dosa");
 aishwarya.takeOrder("Dosa","Idly");
 aishwarya.takeOrder("Dosa","Idly","Wada");
}
}



