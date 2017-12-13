package day12.access;

public class Rectangular extends Shape {
	private double width;
	private double hight;
	public Rectangular() {
		super();
	}
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight =hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<0)
			return;
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		if(hight<0)
			return;
		this.hight = hight;
	}
	@Override
	public void calculationArea(){
		area=this.width*this.hight;
	}	
	@Override
	public String toString(){
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangular){
			Rectangular re=(Rectangular)obj;
			if((re.hight==this.hight) && (re.width ==this.width))
				return true;
		}
			return false;
	}
}


