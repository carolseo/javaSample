package Test;

import book.ver01.Book;
import book.ver01.BookMgr;

public class BookTest {
	
	public static void main(String[] args){
		
		/*
		Book b1 = new Book();	// default 생성자 필요
		// b1.title = "java";	<-private 접근 불가
		// b1.price = -20000;
		
		b1.setTitle("java");
		b1.setPrice(-20000);	// 유효성 검증 필요
		b1.display();
		
		Book b2 = new Book("JSP", -2200);	// 매개변수 생성자 필요, 유효성 검증 필요
		b2.display();
		*/
		
		
		//BookMgr bm = new BookMgr();
		//bm.addBook(new Book("java programmng", 1000));
		//bm.addBook(new Book("java JSP", 2000));
		//bm.addBook(new Book("Spring", 4000));
		
		//bm.printBookList();
		//bm.printTitleList();
		
		Book[] data = {};
		BookMgr bm = new BookMgr(data);
		bm.printBookList();
		System.out.println("=======================");
		

		
		bm.printBookList();
		bm.printTotalPrice();
		System.out.println();
		System.out.println("=======================");
		System.out.println();
		bm.deleteBook("java programmng");
		bm.printBookList();
		
		
		
		
	}

}
