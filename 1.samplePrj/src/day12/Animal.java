package day12; //상속을 전제하는 추상 클래스

public abstract class Animal { //일반 class는 abstract method를 포함할수 없음.
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
	public abstract void breath();  //구현부가 없는 method
}
