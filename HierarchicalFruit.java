
	class Fruit
	{
	void types()
	{
	System.out.println("various types of fruits are 1.apple 2.mango 3.bananae 4.orange");
	}
	}
	class Apple extends Fruit
	{
	void colour()
	{
	System.out.println("Apple is in red colour");
	}

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Apple gives sweet taste");
	}
	}
	class Mango extends Fruit
	{
	void taste()
	{
	System.out.println("mango gives sweet taste");
	}
	void colour()
	{
		System.out.println("Mango is in yellow color");
	}
	 class HiererachicalFruit
	 {
	  public void main(String args[])
	{
	Apple a1=new Apple();
	Mango m1=new Mango();
	a1.types();
	a1.taste();
	m1.types();
	m1.colour();
	}
	}


}
