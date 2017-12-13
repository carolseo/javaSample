package day13;

public class ShapeTest2 {
	public static void main(String[] args) {
		Point[] p = {                  // 점 4개 관리하는 사각형 형태 (has - a)
				new Point(10, 10),
				new Point(20, 10),
				new Point(10, 20),
				new Point(20, 20),
	};
	Rectangle r = new Rectangle(p, "Blue");
	System.out.println(r);
	r.draw();
	}
}
