package prob_1110;

public class BookTest {
	public static void main(String[] args) {
		Book [] data = {new Book("ASP","Tomas",800, 2015), new Book("PHP","Anna", 8800,2009), new Book("Spring","Tiago",5000,2010)};
		BookMgr bm = new BookMgr(data);     
		bm.sortYearList();
		bm.printBookList();
		
		System.out.println("======================================");
	//	bm.addBook(new Book("java programming", 1000));
	//	bm.addBook(new Book("javaJSP", 2000));
	//	bm.addBook(new Book("Spring", 4000));
	
	
	   // bm.printTitleList();		
		
		/* Book b1 = new Book();   
		b1.setTitle("java");
		b1.setPrice(20000);
		b1.display();
		
		Book b2 = new Book("JSP", -2200);
		b2.display(); */

		

	}
}
