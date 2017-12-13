package day15.Inner02;

public class DiceGame2 {
	public static void main(String[] args){  //main method에는 throws Exception 사용 X
		DiceGame2 game = new DiceGame2();  // 객체 생성 필요
		//예외발생 가능한 block들을 처리: try~catch
		try{
		int result1 = game.countSameEye(10);  //main method는 this 사용 불가능, 주소값 필요
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
			 
				int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally{  //예외발생 여부 상관없이 항상 수행
		}	
		System.out.println("main END");
	}
	int countSameEye(int n) throws Exception{    //선언부+body부 형태의 method
		if(n < 0){   //음수 발생시 예외발생 처리
			throw new Exception("던지는 게임 횟수는 음수 불허용");  //RunTimeEx.의 자식은 unchecked
	
			
		}
		int count = 0;
		Dice dice1 = new Dice(8);   //Dice 1 생성 
		Dice dice2 = new Dice(8);  // Dice 2 생성
		
		for(int i=0; i<n;i++){
			if(dice1.play()==dice2.play()) count ++;
		}
		return count;
	}		
}	
class Dice {
	int size;
	Dice(int size){
	this.size = size;
	}	       
	int play(){
	int number = (int)(Math.random() * size) + 1;
	return number;
		    }

}
