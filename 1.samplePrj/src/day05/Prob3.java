package day05;

public class Prob3 {

	public static void main(String[] args) {
/* 	String sourceString = "everyday we have is one more than we deserve";
				String encodedString = "";
			
				for(int i=0;i<=sourceString.length()-1;i++){   
					char c = sourceString.charAt(0);  //data 추출
					if(c=='x' || c=='y' ||c=='z'){
							encodedString += (char)(c-23);  
				}else if (c == '  ') {
							encodedeString += c;
				}else {
							encodedString += (char)(c+3);
				}
				
				// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
				
			
				
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);
				*/
				System.out.println("================================");
				String msg = "hello Java";
				char [] s = msg.toCharArray();    //Char배열 변환 API.
				char [] t = new char[s.length];
				for(int i = 0 ; i<s.length ; i++){
						if(s[i]>= 'A' && s[i]<='Z'){
								t[i] = (char)(s[i]+ 32);   //소문자에서 대문자로
			
						} else if (s[i] == ' '){
								t[i] = s[i];
						}else {
								t[i] = (char)(s[i]-32);  // 대문자에서 소문자로
											
						}
					 	}
				String name = new String("홍길동");
				String msg2 = new String(t);
				
				System.out.println(msg);
				System.out.println(msg2);
				
				}
	}

