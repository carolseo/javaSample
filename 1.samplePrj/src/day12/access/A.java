package day12.access;

public class A {
		public String name1 = "A";
		protected String name2 = "A";            // 다른 pkg도 상속이면 가능.
		String name3 = "A";                                 //same pkg 영역
		private String name4 = "A";
}

class B{
		A a;
		void print(){
			System.out.println(a);
}
		}
