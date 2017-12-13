package book.ver01;

public class BookMgr {

	private int count = 0;
	private Book[] bookList = new Book[100];

	public BookMgr() {}

	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, bookList, count, data.length);
		int i = count;
		for (int j = 0; j < data.length; j++) {
			bookList[i].setNum(i++ + 1);
		}
		count = count + data.length;
	}

	public void addBook(Book data) {
		if (count > 99) {
			Book[] temp = new Book[count + 100];
			System.arraycopy(bookList, 0, temp, 0, count);
			bookList = temp;
		}
		bookList[count] = data;
		bookList[count].setNum(count + 1);
		count++;
	}

	public void addBook(Book[] data) {
		for (int i = 0; i < data.length; i++) {
			if (count > 99) {
				Book[] temp = new Book[count + 100];
				System.arraycopy(bookList, 0, temp, 0, count);
				bookList = temp;
			}
			bookList[count] = data[i];
			bookList[count].setNum(count + 1);
			count++;

		}
	}

	public void deleteBook(String title) {
		Book[] temp = new Book[bookList.length];
		System.arraycopy(bookList, 0, temp, 0, count);
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				this.bookList[i] = null;
				System.arraycopy(temp, i + 1, bookList, i, count);
				this.bookList[count] = null;
				count--;
			}
		}
	}


	/*public void display(int num) {
		System.out.printf("Book %3d [%s : %d (%d)]%n", bookList[num - 1].getTitle(),
				bookList[num - 1].getPrice()); */
	

	public void printBookList() {
		for (int i = 0; i < count; i++) {
			bookList[i].display();
		}
	}

	public void printTitleList() {
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.printf("책 가격의 총합 : %d원", sum);
	}

	// 검색 기능 추가
	public void searchBookList(String title) {
		int c = 0;
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				bookList[i].display();
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}

	// 삭제 기능 추가
	public void delete(String title) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				System.out.print("삭제합니다 : ");
				bookList[i].display();
				System.arraycopy(bookList, i + 1, bookList, i, count - i);
				count--;
			}
		}
	}
}
