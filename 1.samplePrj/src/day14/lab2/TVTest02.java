package day14.lab2;

public class TVTest02 {
	public static void main(String[] args) {
		//TV user = new PTV();    //TV 부모타입에 해당하면 STV, LTV 상관없이 binding 가능함.  /왼쪽 사용자 = 오른쪽 구현체 
		TV user =null;
				
				if(args[0].equals("p")){      //*****동적binding (모든 경우의 수 불러오기)
					user= new PTV();
				}else if(args[0].equals("s")){
					user = new STV();
				}else{
					user = new LTV();
				}
					
				user.poweron();
				user.poweroff();
	}
}

interface TV {   //on,off 호출 매커니즘
	void poweron();
	void poweroff();
	
}
class LTV implements TV{
	@Override
	public void poweron() {		
		System.out.println(getClass().getSimpleName()+"poweron()");   //getSimpleName() 주소값 안나오기?
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}
	
}
class STV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}
}
class PTV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}
}