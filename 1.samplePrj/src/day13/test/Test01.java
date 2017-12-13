package day13.test;

public class Test01 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculationArea();
		c.draw();
		c.drawColor();
		Shape s = c ;
		s.calculationArea();  //상위 조건때문에 calc()만 사용 가능.
		System.out.println(c);
		System.out.println(s);
		Drawable d = c;
		d.draw();     //상위 조건때문에 draw()만 사용 가능.
		
		Shape[] ss ={  
			new Circle(),  //객체가 많아서 관리 용이하지 않음.
			new Rectangle()
		};
		for(int i=0;i <ss.length;i++){
			ss[i].calculationArea();
			((Drawable)ss[i]).draw();         //draw, drawColor는 호출 불가능하므로 casting 필요.
			((Colorable)ss[i]).drawColor();
		}
	}
}
