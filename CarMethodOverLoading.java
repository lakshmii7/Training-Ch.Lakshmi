class  CarsShowRoom
{
	void listCars(){
		System.out.println("1.Audi\n2.BMW\n3.Benza\n4.Maruti Suzuki");
		}
		void takeCar(String order){
		System.out.println("item ordered is "+order);
		}
		void takeCar(String order1,String order2){
		System.out.println("item ordered is "+order1+" and "+order2);
		}
		void takeCar(String order1,String order2,String order3){
		System.out.println("item Ordered is "+order1+" and "+order2+" and "+order3);
		}
		}

public  class CarMethodOverLoading{
		public static void main(String args[]){
		CarsShowRoom cars=new CarsShowRoom();
		cars.listCars();
		cars.takeCar("Audi");
		cars.takeCar("Audi","BMW");
		cars.takeCar("Audi","BMW","Benz");
		}
		}



