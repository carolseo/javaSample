package day13.prob;

public abstract class Shape_2 {
	int numSides;
	
	// public Shape_2 (){}   //부모의 default 생성자 
	public Shape_2(int numSides) {
		super();
		this.numSides = numSides;
	}
	public int getNumSides() {
		return numSides;
	}
	abstract double getArea();
}

interface Resizable_2{   //interface는 자동으로 public abstract 처리 (body부가 없음)
	public abstract void resize(double s);
}
class RectTriangle_2 extends Shape_2{
	double w;
	double h;
	
	public RectTriangle_2(double w, double h) {
		super(3);  //부모의 default 생성자 호출할 필요 없음.
		this.w = w;
		this.h = h;
	}

	@Override
	double getArea() {
		return w*h/2;
	}
	
}
class Rectangle_2 extends Shape_2 implements Resizable_2{
	double w;
	double h;
	
	public Rectangle_2(double w, double h) {
		super(4);
		this.w = w;
		this.h = h;
	}

	@Override
	public void resize(double s) {
		w = w*s;
		h = h*s;
		
	}

	@Override
	double getArea() {
		return w*h;
	}
	
}