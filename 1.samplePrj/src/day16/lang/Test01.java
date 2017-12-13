package day16.lang;

public class Test01 {
	public static void main(String[] args) {
		Point p = new Point(1, 1);    //생성자 함수
		System.out.println(p);
		p.close();  //null assign하기 전에 자원 반납.
		 p=null;   //다 쓴 객체는 null해야 G.C. 대상이 됨.
		
		// System.gc();  //강제 호출됨 / 서비 중지 상태가 되서 메모리 관리만 해야하므로 거의 사용하지 않음. 자원 반납시 close() 사용.
		
		
		System.out.println("main end");
		
	}
}

class Point implements Cloneable{    //복제 객체 내부적으로 파악하여 marking 함(interface)
	private int x;
	private int y;
	
	public Point() {		}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	protected void finalize() throws Throwable {     //소멸자 역할 / Java에서는 거의 사용하지 않고 대신하여 close() 사용함.
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() 수행");
		System.out.println("자원반납코드");
	}
	void close(){
		System.out.println(getClass().getSimpleName()+"finalize() 수행");
		System.out.println("자원반납코드");
	}
	@Override
	protected Point clone() {   //Object(항상 downcasting 필요) or Point 둘다 사용 가능.
		Point obj = null;
		try {
			obj = (Point)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;

		} 
	}