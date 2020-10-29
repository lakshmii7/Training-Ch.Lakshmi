import java.util.Scanner;

class College
{
String college_name;
String college_address;
int established_year;
int college_strength;
static String college_code;
String college_state;
String college_district;
int courses_offered;
}

public class InstitutionScanner 
{
 public static void main(String args[])
   {
	College mret=new College();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter College Details");
	mret.college_name=sc.next();
	mret.college_address=sc.next();
	mret.established_year=sc.nextInt();
	mret.college_strength=sc.nextInt();
	College.college_code=sc.next();
	mret.college_state=sc.next();
	mret.college_district=sc.next();
	mret.courses_offered=sc.nextInt();

	System.out.println("==========College details=======");
	System.out.println("college name is:"+mret.college_name);
	System.out.println("college address is:"+mret.college_address);
	System.out.println("established year is:"+mret.established_year);
	System.out.println("college strength is:"+mret.college_strength);
	System.out.println("college code is:"+mret.college_code);
	System.out.println("college state is:"+mret.college_state);
	System.out.println("college district is:"+mret.college_district);
	System.out.println("no.of courses offered is:"+mret.courses_offered);
	
    }	
}
