class Person
{
int height;
int weight;
float width;
float salary;
long mobile_number;
long id_number;
String name;

Person(int height,int weight,float width,float salary,long mobile_number,long id_number,String name)
{
this.height=height;
this.weight=weight;
this.width=width;
this.salary=salary;
this.mobile_number=mobile_number;
this.id_number=id_number;
this.name=name;
}

}
public class InformationConstructor
{
 public static void main(String args[])
{
/* Creating an object for person class */ 
Person neha=new Person(20,40,16.5f,879.5f,9345677,880045,"kavya");
System.out.println("height:"+neha.height);
System.out.println("weigth:"+neha.weight);
System.out.println("width:"+neha.width);
System.out.println("salary:"+neha.salary);
System.out.println("mobile_number:"+neha.mobile_number);
System.out.println("id_number:"+neha.id_number);
System.out.println("name:"+neha.name);

}
}
  


