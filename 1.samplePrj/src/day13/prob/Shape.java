package day13.prob;

public abstract class Shape {
	int numSides;

	public Shape() {
		super();
	}

	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	@Override
	public String toString() {
		return "Shape [numSides=" + numSides + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Shape){
			Shape sh =(Shape)obj;
			if (sh.numSides == this.numSides)
				return true;
		}
		return false;		
		}

	abstract double getArea();
	
	
}	

