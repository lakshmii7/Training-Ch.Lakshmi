class University {
   void announcement() {
    System.out.println("exams starts from 1st Dec");
}
class Department {
   void examPapers() {
     System.out.println("exam papers are being  prepared");
}
}
} 
class MemberInner {
public static void main(String args[])
 {
  University jntu=new  University();
 jntu.announcement();
  University.Department cse=jntu.new Department();
  cse.examPapers();
}
}

 