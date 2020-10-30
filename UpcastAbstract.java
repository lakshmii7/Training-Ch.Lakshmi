abstract class Car
{
abstract void cost();
abstract void milage();
void start()
{
System.out.println("Starts with a key");
}
		
}
class Audi extends Car
{
void cost()
{
System.out.println("audi cost is 60lakhs");
}
void milage()
{
System.out.println("audi milage is 20kmpl");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("bmw cost is 90lakhs");
}
void milage()
{
System.out.println("bmw  milage is 6kmpl");
}
}
class UpcastAbstract
{
public static void main(String[] args)
{
Car m=new Car();
m.cost();
m.milage();
m=new Audi();
m.cost();
m.milage();
m=new Bmw();
m.cost();
m.milage();
}
}



}
