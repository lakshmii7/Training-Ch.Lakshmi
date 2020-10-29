

	class library { 

		void takeOrder(String order){
		System.out.println(" first order given is "+order);
		}
		void takeOrder(String order1,String order2){
		System.out.println("second order given is "+order1+" and "+order2);
		}
		void takeOrder(String order1,String order2,String order3){
		System.out.println("third order given is  "+order1+ " and " +order2+ " and " +order3);
		}
		
		}
	public 	class BookMethodOverloading{
		public static void main(String args[]) {
		library text=new library();

		text.takeOrder("novels");
		text.takeOrder("magazines","textbooks");
		text.takeOrder("journals","storybooks","novels");
		
		}
		}


