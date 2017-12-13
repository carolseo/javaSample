package day16.lang;  //얕은 복제 vs 깊은 복제

public class Test04 {
	public static void main(String[] args) {
		Circle c1 = new Circle (new Point(5,5), 3);
		// System.out.println(c1);
		
		Circle c2 = c1.clone();
		
		c1.p.setX(99);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}

class Circle implements Cloneable{
	Point p;
	double r;
	public Circle() {
		super();
	}
	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}
	public Point getP() {
		return p;
	}
	public double getR() {
		return r;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	@Override
	protected Circle clone() {
		Circle c = null;
				try {
					c = (Circle) super.clone();
					Point p  = c.p.clone();
					c.p = p;  //안에 있는 객체를 clone()사용하여 복제 > 깊은 복제 수행 
					
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
		return c;
	}
	
}