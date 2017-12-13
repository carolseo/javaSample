package day08;

public class P298 {
	public static void main(String[] args) {
		Car c1 = new Car("Red", 4, "Auto");
		Car c2 = c1;   // 같은 주소임.(복제개체X) Call by reference / c1 변경사항을 c2에 적용. 
		Car c3 = new Car(c1);  //c1의 복사본을 c3에 생성 (복제된 개체. object copy)  /c1과 c3은 다른 주소이므로 적용X.
		
		c1.color = "Gray";
	}
}

class Car{
	String color;
	int door;
	String gearType;

	// default 생성자함수(기본 생성자) 생성 > class name 동일, return X
	Car(){}
	Car(String color, int door, String gearType){    //primitive data
		this.color = color;          // 초기화
		this.door = door;
		this.gearType = gearType;
	}
	Car(Car c){        // 인스턴스 복사    //reference data
		this(c.color,c.door,c.gearType);
	/*	this.color = c.color;                      //중복 내용, 상기와 같이 한줄 처리
		this.door = c.door;
		this.gearType = c.gearType;  */
		
	}
	
	public void display(){    //정보 출력
		System.out.printf("Car[%s,%d,%s]%n",color,door,gearType);
		
	}
}
