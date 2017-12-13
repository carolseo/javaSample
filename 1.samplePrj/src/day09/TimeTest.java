package day09;

import util.Time;  

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		
		Time t2 = new Time(15,07,22);
		// System.out.println(t2.hour);   오류 처리
		t2.setHour(52); 
		System.out.println(t2.getHour()+"시");
		t2.setMinute(-77);
		t2.setSecond(-77);
		System.out.println(t2.getSecond());
		// Time t3 = new Time(3,16,22,false);
		System.out.println("========================================");
		Time t4 = new Time(15,-77,22);  
		System.out.println(t4);   // A
		t4.display();       // B
	}

}
