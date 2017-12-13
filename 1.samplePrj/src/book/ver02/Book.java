package book.ver02;

public class Book implements Comparable <Book> {
	
	private int num = 0;
	private String title;
	private String author;
	private int price;
	private int pubYear;
	
	public Book() {}

	public Book(String title, int price){
		setTitle(title);
		setPrice(price);
	}
	
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
	sb.append("author");
	sb.append(",");
	sb.append(price);
	sb.append(",");
	sb.append("pubYear");
	sb.append("]");
	return sb.toString();
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + num;
	result = prime * result + price;
	result = prime * result + pubYear;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (num != other.num)
		return false;
	if (price != other.price)
		return false;
	if (pubYear != other.pubYear)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}

@Override
public int compareTo(Book o) {
	return num-this.num;
}
	
}
