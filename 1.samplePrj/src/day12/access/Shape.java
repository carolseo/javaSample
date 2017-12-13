package day12.access;

import day12.Student;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {
	}

	public Shape(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
@Override
	public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append(name);
	sb.append("의 면적은 ");
	sb.append(area);
	return sb.toString();
}

@Override
	public boolean equals(Object obj) {
		if(obj instanceof Shape){
			Shape sh=(Shape)obj;
			if ((sh.area == this.area) && (sh.name.equals(this.name)))
				return true;
		}
		return false;
}

	public void print(){
	System.out.printf("%s  %n",this.toString());
	}

	public abstract void calculationArea();

}





