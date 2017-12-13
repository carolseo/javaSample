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
				fw.write(""); // ������ ����
				fw.flush();
				List<Book>d = Arrays.asList(data);  //ArrayList ������ �����Ͽ� ����.
				bookList.addAll(d);
				saveBookList(); //���� ��� ȣ��
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e){
				
			}
			
		}else{
			saveBookList();
			bookPrint();
		}

	}
// Book ��� ���
	public void addBook(Book data) {
		bookList.add(data);
		saveBookList();
	}
// Book[] ��� ���
	public void addBook(Book[] data) {
			for (int j = 0; j < data.length; j++) {
			bookList.add(data[j]);
			saveBookList();
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
	public void saveBookList(){ //txt ���� �����ϱ�(FileWriter) �߰�
			try {
				System.out.println("å�������");
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
	public void bookPrint(){ //txt ���� �о����(FileReader) �߰�
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
}
