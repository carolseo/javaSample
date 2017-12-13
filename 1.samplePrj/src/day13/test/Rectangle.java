package day13.test;

public class Rectangle extends Shape implements Colorable,Drawable{

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() +"그리기");
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName() +" 색칠하기");
	}

	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName() +"의 면적을 계산합니다.");
	}

}
