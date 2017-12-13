package prob_1110;

public class BookMgr {
	int count = 0; // 현재 배열에서 실질적 위치 지정 변수(관리)
	int[] year = new int[100];
	Book[] bookList = new Book[100]; // 현 storage

	public BookMgr() {
	} // default 생성자 함수

	public BookMgr(Book[] data) { // storage 교체 의미 (필요없을시 제거 가능) // null 체크 필요.
		System.arraycopy(data, 0, bookList, count, data.length); // for문 대체 가능
		count = count + data.length; // 기존 data에서 bookList로 셈.
	}

	public void addBook(Book data) {
		bookList[count] = data;
		count++;
	}

	public void printBookList() { // 책 정보 출력
			System.out.println("======== 책 정보를 출력합니다 ========== ");
			System.out.println("도서명 : (저자),  도서 가격,  출판연도 ");	
			for (int i = 0; i < count; i++) {
			bookList[i].display();
		}
	}

	public void printTitleList() { // 책 이름 + 저자 출력
			System.out.println("============= 도서명(저자) 리스트 ============");
			for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle()+ " ("+(bookList[i].getAuthor()+")"));
		}
	}

	
	public void sortYearList() {    // 출간연도 오름차순 정렬 출력
		System.out.println("======출간연도 오름차순 정렬 도서 리스트 =========");
		for (int i = 0; i < count-1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (bookList[i].getPubYear() > bookList[j].getPubYear()) {
					Book temp = bookList[i];
					bookList[i] = bookList[j];
					bookList[j] = temp;
					System.out.println(bookList[i].getTitle()+ " ("+(bookList[i].getPubYear()+")"));
				}
			}
		}
	}
}
