package day16.exam;

public class Test {
	int number = 100;
	public void printValue(){
		int number = 100;
		change(number);
		System.out.println(number);
		System.out.println(this.number);
}
	private void change(int number) {
		number += number;
	}
	public static void main(String args[]){
		Test test = new Test();
		test.printValue();
	
	}
}