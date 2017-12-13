package day19; //Stack.class  (resizing이 되고 다른 type도 관리 가능함)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // int type 관리 generics
													// <integer>
		for (int i = 0; i <= 77; i++) {
			stack.push("" + i); // 기본형(int)은 내부적으로 자동 객체화 (autoboxing)
		}
		System.out.println(stack.pop()); // 최상단에 들어간 객체
		System.out.println("-------------------------------------------");
		
		Queue<Integer> queue = new LinkedList<Integer>();    //Queue구조 
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue.poll());
	}
}
