class Electronics{
void types()
{
System.out.println("electronics types are 1.mobile 2.laptop 3.tv");
}
}
class Mobile extends Electronics
{
void model()
{
System.out.println("model is oppo");
}
}
class Oneplus extends Mobile
{
void colour()
{
System.out.println("colour is green");
}
}
class MultiMobile{
public static void main(String args[])
{
Oneplus s1=new Oneplus();
s1.types();
s1.model();
s1.colour();
}
}

