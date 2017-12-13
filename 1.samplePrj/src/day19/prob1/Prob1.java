package day19.prob1;

import java.util.Set;

public class Prob1 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		//Set<String> strs = stringSplit(str, "#");
		
		// Prob1.StringSplit(str,"#");   >1번
  
		Prob1 p = new Prob1();
		Set<String> list = Prob1.stringSplit(str,"#"); //> 2번  //호출문에 따라 method 자동 생성.
		System.out.println("=== 문자열 처리 결과 ===");
		
	}

	private static Set<String> stringSplit(String str, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/*private static Set<String> stringSplit(String str, String string) {  >2번
		return null;  compiling error 처리를 위해 return값 null로 설정 */
	

	//private static void StringSplit(String str, String string) {  //>1번: return 값을 모르기때문에 void, class name으로 하기 때문에 static.
		
	

	/*private Set<String> stringSplit(String str1, String str2) { //private화> 내부에서만 쓰는 method
		Set<String> set = null;	 //return값 >set구조 					 //method 선언부에 static이 없을 경우, new 객체 생성 필요.
	
		return set;
	}	*/
}
