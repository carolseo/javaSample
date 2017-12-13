package day12;

public class Dog extends Animal{
	String kind = "강아지 종류";
	String name;
	
	public Dog(){ 
		// super();  // 생략해도 자동 호출됨.(object)
	}
	public Dog(String kind, String name) {
		// super();
		this.kind = kind;
		this.name = name;
	}
	public Dog(String superk,String kind, String name) {
		super(superk); //객체 생성시 부모의 생성자는 원하는 곳을 언급하여 호출 가능.(언급X -> default 생성자 호출)
		this.kind = kind;
		this.name = name;
	}
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}
	@Override
	public void breath() {
		System.out.println("폐로 동작");
				
		
	}
	// public void breath(){}   //overriding 사용. 미완성 코드 구현

		
	


			}

