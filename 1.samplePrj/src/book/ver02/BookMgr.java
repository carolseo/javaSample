package book.ver02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();

	public BookMgr()throws FileNotFoundException {
		String fileName = "c:/file/sample1.txt";
		Scanner s = new Scanner(new File(fileName));
			while(s.hasNextLine()){
				String readLine = s.nextLine();  //한줄 읽기
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0].trim(),Integer.parseInt(data[1].trim())));
			}

	}
	
	public BookMgr(Book[] data) {
		List<Book>d = Arrays.asList(data);  //List화하는 API.
		bookList.addAll(d);
		/* for (int i = 0; i < data.length; i++) {
			bookList.add(data[i]);
 		}*/
	}
// Book 등록 기능
	public void addBook(Book data) {
		bookList.add(data);
	}
// Book[] 등록 기능
	public void addBook(Book[] data) {
			for (int j = 0; j < data.length; j++) {
			bookList.add(data[j]);
 		}
	}
// Book 삭제 기능
	public void delete(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if(book.getTitle().equals(title)){
				System.out.println("삭제 도서 정보:   "+ book);
				it.remove();
		}
		}
	}
// Book 정보 출력 기능
	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).display();
		}
	}
	public void printLatestBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getPubYear() == 2017){
				bookList.get(i).display();
			}
		}
	}
	public void printTitleList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).getTitle());
		}
	}
	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < bookList.size(); i++) {
			sum += bookList.get(i).getPrice();
		}
		System.out.printf("책 가격의 총합 : %d원", sum);
	}

// 검색 기능 추가 
	public void searchBookList(String title) {
		int c = 0;
		
		for(Book data :bookList){
			if(data.getTitle().equals(title)){
				data.display();
	/*	for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				bookList.get(i).display(); */
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
}
	public void searchBookList2(String author) {
		int c = 0;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getAuthor().equals(author)) {
				bookList.get(i).display();
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}
	public void searchBookList3(int num) {
	int c = 0;
	for (int i = 0; i < bookList.size(); i++) {
		if (bookList.get(i).getNum()==num) {
			bookList.get(i).display();
			c++;
		}
	}
	if (c == 0) {
		System.out.println("요청한 도서가 없습니다.");
	}
}
}
