package day17;  // SimpleDateFormat

import java.util.Calendar;
import java.util.Date;

public class P544 {
	public static void main(String[] args) {
		String name = "홍길동";
		System.out.printf("%s , %s,  %d,  %f  %n",name,"~~~~",90,5.5);
		
		String msg = String.format("%s , %s,  %d,  %f  %n",name,"~~~~",90,5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI);
		System.out.println(df);
	
		Date d = new Date(2017,11,21);  //Java에서 deprecated API (구버전에서는 사용, 현재는 X) 
		System.out.println(d);
		System.out.println(d.getYear()); 
		System.out.println("_________________________");
		// Calendar c = new Calendar();  Calender는 일반 객체 생성 불가능하므로 하위 방식으로 가능.
		Calendar c =Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		// c.set(2016, 11, 21);   month 정보는 0~11로 관리됨.
		// System.out.println(c);
		
		df = String.format("%tY년 %tm월 %te일 %n", c,c,c);     
		System.out.println(df);
		df = String.format("%1$tY년 %1$tm월 %1$td일  %1$ta요일  %n", c);   // 1$ 첫번째 있는 위치정보 표기
		System.out.println(df);
		
		
	}
}
