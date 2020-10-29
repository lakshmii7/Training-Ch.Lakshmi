import java.util.Scanner;

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
			public class StudentScanner {
			public static void main(String args[]) {
			Student laxmi=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student details");
			laxmi.student_id=sc.nextInt();
			laxmi.student_age=sc.nextInt();
			laxmi.student_yop=sc.nextInt();
			laxmi.student_percentage=sc.nextInt();
			laxmi.student_height=sc.nextFloat();
			laxmi.student_address=sc.next();
			Student.college_name=sc.next();
			Student.department=sc.next();
			System.out.println("==============Student details============");
			System.out.println(" student id is :"+ laxmi.student_id);
			System.out.println("student age is :"+ laxmi.student_age);
			System.out.println("student yop is:" +laxmi.student_yop);
			System.out.println("student percentage is:"+ laxmi.student_percentage);
			System.out.println( "student height is:" +laxmi.student_height); 
			System.out.println(" student address is:" +laxmi.student_address);		
			System.out.println(" college_name  is:"  +Student.college_name);
			System.out.println(" department is:" +Student.department);
			Employee shiva=new Employee();
			
			System.out.println("enter employee details");;
            shiva.employee_id=sc.nextInt();
            shiva.employee_name=sc.next();
            shiva.employee_age=sc.nextInt();
            shiva.employee_salary=sc.nextInt();
            Employee.companyname=sc.next();
            shiva.employee_address=sc.next();
            shiva.employee_designation=sc.next();
            shiva.company_location=sc.next();
            System.out.println("==============Employee details============");
            System.out.println("employee id is :"+shiva. employee_id);
            System.out.println("employee.name is :"+shiva.employee_name);
            System.out.println("employee age is :" +shiva.employee_age);
            System.out.println("employee salary is :"+shiva.employee_salary);
            System.out.println(" companyname is:"+ Employee.companyname);
            System.out.println("employee address is:" +shiva.employee_address);
            System.out.println("employee designation is:" +shiva.employee_designation);
            System.out.println(" company location is:" +shiva.company_location);		
        

	}

}
