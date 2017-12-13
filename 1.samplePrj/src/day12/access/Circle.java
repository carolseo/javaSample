package day12.access;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super();
	}
		public Circle(String name, double radius) {
		super(name);    // or super.setName(name);
		this.radius = radius;
	}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			if(radius<0)
				return;
			this.radius = radius;
		}
		@Override
		public void calculationArea() {
			area = Math.PI*this.radius*this.radius;
		}
		@Override
		public String toString(){
			return super.toString();
			}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Circle){
				Circle cr=(Circle)obj;
				if((cr.radius==this.radius))
						return true;
				}
					return false;
		}
	}

