package day13.prob;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle ro = new Rectangle(5,6);
		RectTriangle rt = new RectTriangle(6,2);

		Shape[] sh = {ro, rt}; 
		for(int i=0; i <sh.length; i++){
		System.out.println(" area: "+ sh[i].getArea() );
			if(sh[i] instanceof Resizable){
				((Resizable)sh[i]).resize(0.5);
				System.out.println("new area:" + sh[i].getArea());
			}
		
		}
	}

}
