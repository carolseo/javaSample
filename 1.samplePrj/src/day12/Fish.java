package day12;

public class Fish extends Animal {
	String name ;
	public Fish() {
		super();
	}
	public Fish(String name) {
		this.name = name;
	}
	public Fish(String kind,String name) {
		super(kind);  //하단 두 라인을 한 라인으로 축약 가능.
		//super();
		//super.setKind(kind);  //부모의 생성자 추가
		this.name = name;
	}
	@Override   //jdk 1.5부터 overriding이 제대로 되었는지 체크. 
	public void breath(){
		System.out.println("아가미로 숨쉬기"); 
	}
	public void display(){
		System.out.printf("Fish[%s %s]%n",super.getKind(),name); //private 접근자원자 접근 불허이므로 getKind 사용.
				
	}
}

