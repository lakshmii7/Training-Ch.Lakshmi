class Book
{
	String booktitle;
	String bookauthor;
	int bookpages;
	int bookprice;
	String publishername;
	int publishedyear;
	int bookid;
	
	public Book(String booktitle,String bookauthor,int bookpages,int bookprice,String publishername,int publishedyear,int bookid)
	{
		this.booktitle=booktitle;
		this.bookauthor=bookauthor;
		this.bookpages=bookpages;
		this.bookprice=bookprice;
		this.publishername=publishername;
		this.publishedyear=publishedyear;
		this.bookid=bookid;
		
	}
	

}
public class BookConstructor {
 public static void main(String args[])
 {
	 Book novel=new Book("c programming","dennis ritchie",567,670,"prentice hall",1978,987);
	 
	 System.out.println("======book details=====");
	 System.out.println("booktitle:"+novel.booktitle);
	 System.out.println("bokauthor:"+novel.bookauthor);
	 System.out.println("bookpages:"+novel.bookpages);
	 System.out.println("bookprice:"+novel.bookprice);
	 System.out.println("publishername:"+novel.publishername);
	 System.out.println("publishedyear:"+novel.publishedyear);
	 System.out.println("bookid:"+novel.bookid);
	 
	
 }
}
