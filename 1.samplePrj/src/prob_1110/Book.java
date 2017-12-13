package prob_1110;

public class Book {
	private String title;              //encapsulation (같은 class내에서만 접근 가능)
	private String author;
	private int price;
	private int pubYear;
	
	
	public Book() {}   // default 생성자
	public Book(String title, String author, int price, int pubYear) {   //생성자 함수 생성
		this.title = title;
		this.author = author;
		// this.price = price;  음수 유효성 검증시 해당이 안됨. 
		setPrice(price);   
		this.pubYear = pubYear;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0){       
			return;
		}
		this.price = price;
	}
	public int getPubYear() {
		return pubYear;
	}
	public void setPubYear(int pubYear) {
		if(pubYear <= 0){   
			return;
		}
		this.pubYear = pubYear;
	}
	
	public void display(){
		System.out.printf("Book - %s : (저자: %s),  %d 원, %d 년 %n",title,author,price,pubYear);
	}
}
