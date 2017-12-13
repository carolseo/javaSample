package day16.lang;  //String API

public class P464 {
	public static void main(String[] args) {
		String msg = "Hello java test~~~~";
		System.out.println(msg);
		// System.out.println(msg = msg.replace('~', '!'));  //문자열 대체 명령. 원래 data 주소로 할당해야.
		System.out.println(msg.replace('~', '!'));  
		System.out.println(msg); // 변경 안됨. String은 읽기 전용이기때문.(계속 객체생성됨)
		msg.concat(" sample");
		System.out.println(msg);

		StringBuffer sb = new StringBuffer("StringBuffer test");  //원본이 계속 바뀜
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" sample");
		System.out.println(sb);
		String s = sb.toString();
		
	}
}
