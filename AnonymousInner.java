abstract class Person {
 abstract void eat();
 }
class AnonymousInner  {
public static void main(String args[])
{
Person p=new Person() {
void eat() {System.out.println("person is eating dosa");}
};
p.eat();
}
}