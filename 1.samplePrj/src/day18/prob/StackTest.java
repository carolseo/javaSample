package day18.prob;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){   //주소.()이므로 instance method
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	int[] stack;
	int top=0;

	public MyStack() {
		stack = new int[0];
	}


	public MyStack(int size) {
		if (size>0){
			stack = new int[0];
		}else{
			stack = new int[size];
		}
	}
		public boolean isEmpty() {
			return top ==0? true: false;
		}
		public boolean isFull() {
			/*if(top == stack.length){
				return true;
			}else{
				return false;
			}*/
				return top == stack.length ? true:false ;    //if문 혹은 삼항연산자 
		}
		
		public void push(int data) {			
			if(isFull()){
				System.out.println("스텍이 꽉 찼습니다.");
				return;
			}
			stack[top] = data;
			top++;
		}
		public int pop(){
			if(isEmpty()){
				return -1;
			}else{
				return stack[--top];
			}
		}
		public int top(){
			if(isEmpty()){
				return -1;
		}
			return stack[top-1];
		}
}

