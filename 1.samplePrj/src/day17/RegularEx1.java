package day17;  //Pattern + Matcher. >조건과 일치하는 문자열 추출

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		/* String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc" }; */
		String [] data = {"javains", "010-1234-5678","javains@gmail.com","a","02-530-1235", "A","123446563","Java test", "f"};
		String pattern = "j.*";
		pattern = "(02|010)-\\d{3,4}-\\d{4}";

		Pattern p = Pattern.compile(pattern);
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()){
				System.out.println(data[i]);
		}
	}
	System.out.println("--------------------- main end -----------------------");
}
}
