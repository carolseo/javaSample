package day02;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 600, y = 700;
		
		System.out.printf("x= %d, y=%d %n ",x,y);
		int temp;
		temp = x;
		x =y;
		y=temp;
		System.out.printf("x= %d, y=%d %n ",x,y);
	}

}
