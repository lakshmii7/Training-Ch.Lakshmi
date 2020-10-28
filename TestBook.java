class Book {
String book_title;
String book_author;
int book_pages;
int book_price;
static String publishername;
int published_year;
int book_id;
}

public class TestBook {
public static void main(String args[])
{
  Book scientists=new Book();
  scientists.book_title="World famous great scientists";
 scientists.book_author="Rajiv tiwari";
scientists.book_pages=136;
scientists.book_id=1256;
scientists.book_price=60;
scientists.publishername="manoj publications";
scientists.published_year=2010;
System.out.println("==========Book Details=========");
System.out.println("book title is :"+scientists.book_title);
System.out.println("book author is :"+scientists.book_author);
System.out.println("book id is :"+scientists.book_id);
System.out.println("book pages is : "+scientists.book_pages);
System.out.println("book  price is: "+scientists.book_price);
System.out.println("publishername is:"+scientists.publishername);
System.out.println("published year is :"+scientists.published_year);
}
}