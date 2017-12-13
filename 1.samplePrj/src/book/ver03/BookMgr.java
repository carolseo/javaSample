package book.ver03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	File file = new File("c://file/booklist.txt");
	List<Book> bookList = new ArrayList<Book>();
	 FileReader fr = null;
	 BufferedReader br = null;
	 FileWriter fw = null;
	 BufferedWriter bw = null;
	 
	public BookMgr()throws FileNotFoundException {
		bookPrint();
		
	}
	
	public BookMgr(Book[] data) {
		if(! file.exists()){
			try {
				fw = new FileWriter("c://file/booklist.txt");
				fw.write(""); // 빈파일 생성
				fw.flush();
				List<Book>d = Arrays.asList(data);  //ArrayList 정보를 빈파일에 저장.
				bookList.addAll(d);
				saveBookList(); //저장 기능 호출
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e){
				
			}
			
		}else{
			saveBookList();
			bookPrint();
		}

	}
// Book 등록 기능
	public void addBook(Book data) {
		bookList.add(data);
		saveBookList();
	}
// Book[] 등록 기능
	public void addBook(Book[] data) {
			for (int j = 0; j < data.length; j++) {
			bookList.add(data[j]);
			saveBookList();
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
	public void saveBookList(){ //txt 파일 저장하기(FileWriter) 추가
			try {
				System.out.println("책저장실행");
				fw = new FileWriter("c://file/booklist.txt");
				bw = new BufferedWriter(fw);
				String info="";
				for(int i=0;i<bookList.size();i++){
					info+= bookList.get(i).getNum()+"/"+ bookList.get(i).getTitle()+"/"+ bookList.get(i).getAuthor()+"/"+ bookList.get(i).getPrice()+"/"+ bookList.get(i).getPubYear();
					if(i < bookList.size()-1){
						info += "\n";
					}
				}
				bw.write(info);
				bw.flush();

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e){
				
			}
			
			
		
	}
	public void bookPrint(){ //txt 파일 읽어오기(FileReader) 추가
		try {
			fr = new FileReader("c://file/booklist.txt");
			br = new BufferedReader(fr);
			String a = null;
			String [] list;
			while(true){
				a = br.readLine();
				if(a == null) break;
				list = a.split("/"); 
				bookList.add(new Book(Integer.parseInt(list[0].trim()),list[1],list[2],Integer.parseInt(list[3].trim()),Integer.parseInt(list[4].trim())));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){
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
