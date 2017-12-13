package book.ver01;

public class Book {
	
	private int num = 0;
	private String title;
	private String author;
	private int price;
	private int pubYear;
	
	public Book() {}

	public Book(int num,String title, String author, int price, int pubYear){
		setNum(num);
		setTitle(title);
		setAuthor(author);
		setPrice(price);
		setPubYear(pubYear);
		}
		
	
	public int getNum() { //Num
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() { //Title
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() { //Author
		return author;
	}
	public void setAuthor(String author) {
			this.author = author;
	}
	public int getPrice() { //Price
		return price;
	}
	public void setPrice(int price) {
		if (price < 0) { // 유효성 검증
			return;
		}
		this.price = price;
	}
	public int getPubYear() { //PubYear
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public void display() {
		System.out.printf("[Book] %03d %d년  %s(%s): %d원  %n", num,pubYear,title,author,price);
	}
@Override
	public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("Book[");
	sb.append("title");
	sb.append(",");
	sb.append(price);
	sb.append("]");
	return sb.toString();
		

		
	}
	
}
