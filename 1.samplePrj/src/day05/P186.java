package day05;    // 배열

public class P186 {
	public static void main(String[] args) {
// default 값
		String[]  names= new String[3] ;
		System.out.println(names[0]+ names[1]+names[2]);
		System.out.println("-----------------------");
		char[]         chars= new char[names.length];  // 문자 여러개    //blank값으로 초기화
		System.out.println(chars[0]+",  "+chars[1]+",  "+ chars[2]);
		System.out.println("-----------------------");
		
		int []          score;    //주소(reference)           
		score = new int[5];   //배열 생성(위치index 전체)
		for(int i = 0; i< score.length ;i++){         //base index=무조건 0
		System.out.print(score[i]+"  , ");     
		}
		System.out.println("\n===================");
		for(int data:score){     // :  data 추출 명령
			  System.out.println(data+"  ");
		

		}
		
		
	}

}
