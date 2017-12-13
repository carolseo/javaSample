package day17;  //문자열 쪼개기 method > StringTokenizer

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514 {
	
	public static void main(String[] args) {
		String msg = "홍길동: 90/100/80 ";
		String [] data = msg.split(":");   // .split("구분자")
		System.out.println(Arrays.toString(data));
		String [] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu));
		System.out.println("_________________________");
		StringTokenizer st = new StringTokenizer(msg, ":/");   //StringTokenizer은 구분자 복수로 분할 가능
		// System.out.println(st.countTokens());    //분할된 String 갯수 세기
		while(st.hasMoreTokens()){  //Token 보유하는 동안
			String s = st.nextToken().trim();
			System.out.println(s);
		}
	}

}
