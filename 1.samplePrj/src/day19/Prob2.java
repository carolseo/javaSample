package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*다음의 메서드 매개변수로 전달되는 첫번째 문자열을 두번째 문자열의 구분자로 잘라내어 
Set 구조에 저장한 후 리턴하는 메서드를 구현하시오. */
public class Prob2 {
	public static void main(String[] args) {

		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");

		System.out.println("=== 문자열 처리 결과 ===");

		// strs 를 아래와같이 출력되도록 코드를 완성하세요
		// System.out.println(strs);
		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);

		}
	}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> set = new TreeSet<>();

		String temp = "";
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				set.add(temp);
				temp = new String();
			} else {
				temp += str1.charAt(i);
			}
		}
		set.add(temp);
		return set;

	}
}

/*
 * <<처리 결과>>
 * 
 * === 문자열 처리 결과 === PROD-001 X-note Samsung 3 600000
 */