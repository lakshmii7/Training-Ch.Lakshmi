
class CarShowRoom
{
	void listCars()
	{
		System.out.println("1.AUDI\n2.Mauruti  suzuki\n3.BMW\n4.Benz");
	}

void takeCar(String order) {
	System.out.println("Car ordered is "+order);
	
}
String giveCar()
{
	return "Audi";
	
}
	
    int bill(){
		return 2500000;
		}
		String payBill(int amount){
		System.out.print("The bill amount "+amount);
		return "paid";
		}
		}

	public	class CarMethods{
		public static void main(String args[]){
		CarShowRoom c1=new CarShowRoom();
		c1.listCars();
		c1.takeCar("BMW");
		System.out.println("Car given is: " + c1.giveCar());
		System.out.println("Bill amount is: "+ c1.bill());
		System.out.println(" is " + c1.payBill(c1.bill()));
		}
		}
		


