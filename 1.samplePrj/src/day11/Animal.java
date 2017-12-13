package day11;

public class Animal {
	private String kind = "동물의 종류";  //명시적 초기화
	public Animal() { //생성자 함수 
		System.out.println(" Animal() 수행");
	}
	public Animal(String kind) {  //superk 
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void breath(){
		System.out.println("폐로 숨쉬기");
	}
}
