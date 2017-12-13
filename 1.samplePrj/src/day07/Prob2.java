package day07; //과제6 선생님 풀이 2

public class Prob2 {
	
	public static String leftPad(String str, int size, char padChar) {   // main method test 
		String result="";
		if (str.length()> size){
			return str;      
		}
		int tmp=size-str.length();   
		for(int i=0; i < tmp;i++){
			result += padChar; 

	  }return result += str;
	}
	public static void main(String[] args) {        //static 주소값 X, Class name 필요 
		String s = Prob2.leftPad("SDS", 7, '!');  // 동일한 type의 변수 s 설정  <leftPad method 호출.
		System.out.println(s.equals("!!!!SDS"));   //예측값 동일한지 true/false 검증
		
	}
}