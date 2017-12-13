package day10;

public class Dog extends Animal{	
	String name;
	String kind="강아지 종류";
	public void bike(){
		System.out.println("bike");
	}
	public void display(){
		System.out.printf("Dog[%s   %s   %s]%n",super.kind, this.kind, this.name);    //부모의 kind와 나의 kind.
	}
}
