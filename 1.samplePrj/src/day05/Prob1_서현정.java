package day05;
/* 암호화된 문자열 값을 아래와 같이 출력하도록 
Prob1의 클래스의 main 함수를 완성하십시오. 
(단, 공백에 대해서는 치환을 적용하지 않습니다.) */

public class Prob1_서현정 {
	public static void main(String[] args) {
				String sourceString = "everyday we have is one more than we deserve";
				String encodedString ="";

				for(int i=0; i <sourceString.length(); i++){
					if(sourceString.charAt(i)=='x'||sourceString.charAt(i)=='y' ||sourceString.charAt(i)=='z'){    //x,y,z의 경우, 특수기호로 넘기지 않기 위해 -23
						encodedString += (char)(sourceString.charAt(i)-23);
					}else if (sourceString.charAt(i)==' '){      //'   ' 공백은 공백으로 동일화.
						encodedString +=(' ');
					}else{
				 encodedString += (char)(sourceString.charAt(i)+3);    //  기본 배열 규칙 +3
				                                      
				 
									
				}
}
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);
				
			
					
				
				// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
				

				}				
			}
		
