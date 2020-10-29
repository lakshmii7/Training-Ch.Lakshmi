

class Car
{
	String carname;
	int price;
	String color;
	int capacity;
	String model;
	int year;
	
    public Car(String carname,int price,String color,int capacity,String model,int year)
	{
		this.carname=carname;
		this.price=price;
		this.color=color;
		this.capacity=capacity;
		this.model=model;
		this.year=year;
		
	}
}
   public class CarConstructor
   {
	   public static void main(String args[])
   
	{
		   Car bmw=new Car("Audi",450000,"black",56890,"Altima",2018);
		   
	
		System.out.println("=========Car details========");
		System.out.println("carname :"+bmw.carname);
		System.out.println("price :"+bmw.price);
		System.out.println("color"+bmw.color);
		System.out.println("capacity:"+bmw.capacity);
		System.out.println("model"+bmw.model);
		System.out.println("year"+bmw.year);
	}
  
   } 
	


