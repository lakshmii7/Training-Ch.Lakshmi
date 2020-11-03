abstract class Car {
 abstract void cost();
 abstract void milage();
}
class NestedClass {
 public static void main(String args[])
{
 Car x=new Car() {
   void cost() {
  System.out.println("Audi cost is 50lakhs");
 }
  void milage() {
  System.out.println("Audi milage is 15km");
}
};
x.cost();
x.milage();
}
}
