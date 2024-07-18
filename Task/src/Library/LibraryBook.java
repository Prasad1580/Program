package Library;

public class LibraryBook {

 
	 String title;
	 String author;
	 String isbn;
	 boolean available;
	 
	 public LibraryBook(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;
	 }
	 
	 void borrowbook() {
		 if (available) {
			 available = false ;
			 System.out.println("Book\""+ title + "\"borrowed successfully.");
			 System.out.println("author=\""+ author +"");
		 }
		 	
		 else {
			 System.out.println("Book\""+ title + "\"is not available for borrowing.");
			 System.out.println("author=\""+ author +"");

		 }
		 
	 }
	 void returnBook() {
		 if (!available) {
			 available = true ;
			 System.out.println("Book\""+ title + "\"returned successfully");
			 System.out.println("author=\""+ author +"");
		 }else {
			 System.out.println("Book\""+ title + "\"is allready available .");
			 System.out.println("author=\""+ author +"");

		 }
		 
	 }
	 public static void main(String[] args) {
		LibraryBook l1 = new LibraryBook("Python","Sam", "1123456789");
		LibraryBook l2 = new LibraryBook("java full stack","Sagar sir", "1123456789");
		LibraryBook l3 = new LibraryBook("html","alen", "8529633");

		l1.borrowbook();
		l1.returnBook();
		
		System.out.println("*****************************");
		
		l2.borrowbook();
		l2.returnBook();
		
		System.out.println("*****************************");
		
		l3.borrowbook();
		l3.returnBook();

		
	}

}



