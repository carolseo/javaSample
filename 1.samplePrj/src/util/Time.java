package util;  // Encapsulation

public class Time {   //p.245
	private int hour;
	private int minute;
	private int second;
	private boolean am = true; // am과 pm 구분, 명시적 초기화
	
	public Time() { 	}   //default 생성자 생성
	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);    //하단 if문 연결을 통해 유효성 검증. (자동생성된 생성자함수 set 변경 가능)
		this.setSecond(second);
	}
	public boolean isAm() {
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public int getHour() {    //대,소문자 주의
		return hour;
	}

	public void setHour(int hour) {
		if(hour<0|hour>23){
			return;
		}
		if(hour>=12) am = false;
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute <0|minute>=60){
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second<0|second>=60){
			return;
		}
		this.second = second;
	}

	public void display(){   //B 
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}
	@Override
	public String toString() {   //정보를 취합해서 문자열로 변환. 객체의 정보 출력(display method 같은 기능).
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";    //A
	}
	
	
	
}
