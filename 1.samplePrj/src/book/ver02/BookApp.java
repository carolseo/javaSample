package book.ver02;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args){
		Book[] data = { 
						new Book(001,"Servlet","Tiago", 5000,2015),
						new Book(002,"자바프로그래밍","김진호", 9000,2010),
						new Book(003,"SQL","Ana", 7000,1997),
						new Book(004,"Spring","이신영", 13000,2016),
						new Book(005, "파이썬", "유선옥", 11000, 2017),
						new Book(006, "JQuery", "김상아", 8500, 2017)  
						};  
		
		BookMgr bm = null;
		try{
			bm = new BookMgr();   
		} catch(FileNotFoundException e){
			 bm = new BookMgr(data);
			
		}
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;
		while(true){
		System.out.println("________________________________________________");	
		System.out.println("***** 도서 정보 프로그램에 접속합니다 *****");
		System.out.println("1. 도서목록 확인");
		System.out.println("2. 도서 [등록]");
		System.out.println("3. 도서 [삭제]");
		System.out.println("4. 도서 [검색]");
		System.out.println("5. 프로그램 종료");
		System.out.println("________________________________________________");	
		System.out.print("원하는 명령을 입력하세요 :");
		cmd = Integer.parseInt(scanner.nextLine().trim());
		String title; 
		String author;
		
		
		switch(cmd){		
		case 1:
			System.out.printf("1.전체 도서 목록	2. 최신(2017년) 도서 목록  %n");
			int f1 = 0;
			f1 = Integer.parseInt(scanner.nextLine());
			if(f1 == 1){
				System.out.println("등록된 전체 도서 목록은 다음과 같습니다.");
				System.out.println("===============================================");
				bm.printBookList();
				System.out.println("===============================================");
			}
		
			else if(f1 == 2){
			System.out.println("2017년에 등록된 최신 도서 목록은 다음과 같습니다.");
			System.out.println("===============================================");
			bm.printLatestBookList();
			System.out.println("===============================================");
			}
			
			break;
			
		case 2:
			System.out.print("등록할 도서 코드를 입력하세요");
			int num = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("등록할 도서 제목을 입력하세요");
			title= scanner.nextLine();
			
			System.out.print("등록할 도서 저자를 입력하세요");
			author= scanner.nextLine();
			
			System.out.print("등록할 도서 가격을 입력하세요");
			int price = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("등록할 도서 발행연도를 입력하세요");
			int pubYear = scanner.nextInt();
			scanner.nextLine();
						
			Book data1 = new Book(num,title,author, price,pubYear);
			bm.addBook(data1);
			break;
			
		case 3:
			System.out.println("삭제작업 수행");
			System.out.println("삭제할 도서 제목을 입력하세요.");
			title = scanner.nextLine();
			bm.delete(title);
			break;
			
		case 4:
			System.out.println("도서 검색 기능 수행합니다.");
			System.out.printf("1.[도서코드]로 검색	2. [도서명]으로 검색	3. [저자명]으로 검색 %n");
			int f4 = 0;
			f4 = Integer.parseInt(scanner.nextLine());
			if(f4 == 1){
			System.out.println("검색할 도서 코드(숫자)를 입력하세요.");
			num = scanner.nextInt();
			scanner.nextLine(); 
			System.out.println("============ 검색 결과는 다음과 같습니다. ==============");
			bm.searchBookList3(num);
			System.out.println("===============================================");
			}
		
			else if(f4 == 2){
			System.out.println("검색할 도서 제목을 입력하세요.");
			title = scanner.nextLine().trim();
			System.out.println("============ 검색 결과는 다음과 같습니다. ==============");
			bm.searchBookList(title);
			System.out.println("===============================================");
			}
			else if(f4 == 3){
				System.out.println("검색할 저자명을 입력하세요.");
				author = scanner.nextLine().trim();
				System.out.println("============ 검색 결과는 다음과 같습니다. ==============");
				bm.searchBookList2(author);
				System.out.println("===============================================");
			}
			
			
			break;
			
		case 5:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			//break;
			
		default :
			System.out.println("1~5 중에서 다시 선택해주세요");
			break;
		}
		}
	}

}
// 추가, 삭제, 검색, 업데이트 는 기본 기능
