package day13.prob;

public class ShapeTest_2 {
	public static void main(String[] args) {
		Shape_2 [] shapes = {
					 new Rectangle_2(5, 6), 
					 new RectTriangle_2(6, 2)};
	
		for(int i = 0; i<shapes.length;i++){
			System.out.println("area:"+shapes[i].getArea());
			if(shapes[i] instanceof Resizable_2){
		((Resizable_2)shapes[i]).resize(0.5);
		System.out.println("new area: "+shapes[i].getArea());
		}
		}
	}
}
