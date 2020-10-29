import java.util.Scanner;

class Book {
String book_title;
String book_author;
int book_pages;
int book_price;
static String publishername;
int published_year;
int book_id;
}

public class TestBookScanner 
{
 public static void main(String args[])
  {
  Book scientists=new Book();
  Scanner sc=new Scanner(System.in);
System.out.println("Enter Book details");
  scientists.book_title=sc.next();
 scientists.book_author=sc.next();
 scientists.book_pages=sc.nextInt();
 scientists.book_price=sc.nextInt();
 Book.publishername=sc.next();
 scientists.published_year=sc.nextInt();
 scientists.book_id=sc.nextInt();
 System.out.println("==========Book Details=========");
 System.out.println("book title is :"+scientists.book_title);
 System.out.println("book author is :"+scientists.book_author);
  System.out.println("book pages is : "+scientists.book_pages);
 System.out.println("book  price is: "+scientists.book_price);
 System.out.println("publishername is:"+Book.publishername);
 System.out.println("published year is :"+scientists.published_year);
System.out.println("book id is :"+scientists.book_id);
 }
}
