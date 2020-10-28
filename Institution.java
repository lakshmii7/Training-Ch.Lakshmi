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

public class Institution{
public static void main(String args[]) {
 College mret=new College();
  mret.college_name="mriet";
  mret.college_address="maisammaguda";
  mret.established_year=2007;
  mret.college_strength=5000;
  mret.college_code="MRET";
  mret.college_state="Telangana";
  mret.college_district="Rangareddy";
  mret.courses_offered=5;
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


