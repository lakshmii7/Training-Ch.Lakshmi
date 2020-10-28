class Student {
int student_id;
int student_age;
int student_yop;
float student_percentage;
float student_height;
String student_address;
static String college_name;
static String  department;
}
  
class Employee{
int employee_id;
int employee_salary;
int employee_age;
String employee_name;
static String companyname;
String employee_address;
String employee_designation;
String company_location;

}
public class Variables {
public static void main(String args[]) {
Student laxmi=new Student();
laxmi.student_id=1246;
laxmi.student_age=22;
laxmi.student_percentage=65.9f;
laxmi.student_yop=2019;
laxmi.student_height=5.6f;
laxmi.student_address="hyderabad";
laxmi.college_name="mriet";
laxmi.department="cse";
System.out.println("==============Student details============");
System.out.println(" student id is :"+ laxmi.student_id);
System.out.println("student age is :"+ laxmi.student_age);
System.out.println("student percentage is:"+ laxmi.student_percentage);
System.out.println("student height is:" +laxmi.student_height);
System.out.println( " student yop is:" +laxmi.student_yop);
System.out.println(" student address is:" +laxmi.student_address);		
System.out.println(" college_name  is:"  +laxmi.college_name);
System.out.println(" department is:" +laxmi.department);

Employee shiva=new Employee();
shiva.employee_id=1206746;
shiva.employee_name="shiva";
shiva.employee_age=25;
shiva.employee_salary=20000;
shiva.companyname="JNIT";
shiva.employee_address="hyderabad";
shiva.employee_designation="Software Engineer";
shiva.company_location="kondapur";
System.out.println("==============Employee details============");
System.out.println("employee id is :"+shiva. employee_id);
System.out.println("employee.name is :"+shiva.employee_name);
System.out.println("employee age is :" +shiva.employee_age);
System.out.println("employee salary is :"+shiva.employee_salary);
System.out.println(" companyname is:"+ shiva.companyname);
System.out.println("employee address is:" +shiva.employee_address);
System.out.println("employee designation is:" +shiva.employee_designation);
System.out.println(" company location is:" +shiva.company_location);		
 }
}
