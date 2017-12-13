package day13.prob;

public class RectTriangle extends Shape {
	double width;
	double height;
	
	public RectTriangle() {
		super();
	}

	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "RectTriangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof RectTriangle){
			RectTriangle rt =(RectTriangle)obj;
			if ((rt.width == this.width) && (rt.height == this.height))
			return true;
			}
			return false;		
	
	}
	@Override
	double getArea(){
		return width*height/2;
	}
}

