package book.ver04_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();
	FileBook file = new FileBook();
	String fileName = "c:/file/book.data";
	
	public BookMgr()throws FileNotFoundException {
	
		bookList = (List<Book>) file.read(fileName); 
		
		if(bookList == null || bookList.size()==0){ 
			fileName = "c:/file/sample1.txt";
			Scanner s = new Scanner(new File(fileName));
			while(s.hasNextLine()){
				String readLine = s.nextLine();  
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0].trim(),Integer.parseInt(data[1].trim())));
			}
		}
		Thread job = new AutoSave();  //Thread ������ ����. *****
		job.start();
		
	}
	public void filesave(){  //filesave ��� �߰�
		file.save(bookList, fileName);
	}
	
	public BookMgr(Book[] data) {
		List<Book>d = Arrays.asList(data); 
		bookList.addAll(d);
		
		Thread job = new AutoSave();  //Thread ������ ����. *****
		job.start();
	}
	
// Book ��� ���
	public void addBook(Book data) {
		bookList.add(data);
	}
// Book[] ��� ���
	public void addBook(Book[] data) {
			for (int j = 0; j < data.length; j++) {
			bookList.add(data[j]);
 		}
	}
// Book ���� ���
	public void delete(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if(book.getTitle().equals(title)){
				System.out.println("���� ���� ����:   "+ book);
				it.remove();
		}
		}
	}
// Book ���� ��� ���
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
		System.out.printf("å ������ ���� : %d��", sum);
	}

// �˻� ��� �߰� 
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
			System.out.println("��û�� ������ �����ϴ�.");
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
			System.out.println("��û�� ������ �����ϴ�.");
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
		System.out.println("��û�� ������ �����ϴ�.");
	}
}
	class AutoSave extends Thread{  //inner class�� Thread ���� *****
		public void run(){
			while(true){
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					file.save(bookList, fileName);
					System.out.println("AutoSave ����");
				}
			}
	}
}
