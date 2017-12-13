package day13.prob;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super(4);
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
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle){
			Rectangle rec =(Rectangle)obj;
			if ((rec.width == this.width) && (rec.height == this.height))
			return true;
			}
			return false;		
	
	}

	@Override
	double getArea() {
		return width*height;
	}

	@Override
	public void resize(double s) {
		width = width*s;   //width *= s 
		height = height*s;
	}	
}
