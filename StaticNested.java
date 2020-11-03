class UniversityStatic {
static class DepartmentStatic {
void announcement() {
  System.out.println("results are declared");
}
  static void result() {
   System.out.println("results are in website");
   }
 }
}
public class StaticNested {
 public static void main(String args[])
  {
  UniversityStatic.DepartmentStatic cse=new UniversityStatic.DepartmentStatic();
  cse.announcement();

  UniversityStatic.DepartmentStatic.result();
  }
}