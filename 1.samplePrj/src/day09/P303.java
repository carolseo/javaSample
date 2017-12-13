package day09;   //

public class P303 {
	public static void main(String[] args) {
		System.out.println("start");
		Product b1 = new Product();   
		Product b2 = new Product();
		Product b3 = new Product();
		
		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);

		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
		System.out.println(Product.count);
		
		System.out.println("end");
	}
}

class Product{   //class 내 default 생성자 자동 생성됨
	static int count = 0;          //static variable  (명시적 초기화)
	int serialNum;                  // instance variable
	
	static{     //static 초기화 block  
		// System.out.println("static{    }");   //1회 호출
		count = 0;  //'static 자원만' 수행, 생성자 함수보다 먼저 수행.   
	}
	
	{
	 //	System.out.println("{}"); //객체생성수마다 호출
		++count;           
		serialNum = count;    //static, instance 둘다 수행. 
	}
	public Product(){    //instance 초기화 block
	//	System.out.println("BlockTest() 기본 생성자");
	}
}