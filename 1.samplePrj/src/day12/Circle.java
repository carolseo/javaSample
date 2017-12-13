package day12;

public class Circle extends Shape {  //다른 틀(shape)에 상속

	@Override
	public double getArea(double r) {     
		return Math.PI*r*r;   //원의 영역 구하기 값 
	}
	
		

}
