package baekjoon;

import java.util.Arrays;
import java.util.Scanner;


class StackNum{ 	//정수를 저장하는 스택
	int peek =-1;	//top랑 같은 의미
	int[] stackArr = new int[1000];
	
	public int top() {
		if(peek==-1)
			return -1;
		else		
			return stackArr[peek];
	}
	
	public void push(int num) {
		peek+=1;
		stackArr[peek]=num;
	}
	
	public int pop() {
		if(peek==-1)
			return -1;
		else {
			peek-=1;
			return stackArr[peek+1];
		}	
	}
	
	public int empty() {
		if(peek==-1)
			return 1;
		else
			return 0;
	}
	public int size() {
		if(peek==-1)
			return 0;
		else
			return peek+1;
	}
	
}

public class Baekjoon10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		int count =input.nextInt(); //명령어의 갯수 입력받기
		
		StackNum stack = new StackNum();
		
		for (int i = 0; i < count; i++) {
			String command = input.next();
		
			switch ( command ) {
			case "push":
				stack.push(input.nextInt());
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" :
				System.out.println(stack.empty());
				break;
			case "top":
				System.out.println(stack.top());
				break;
			}
			
		}
//		System.out.println(Arrays.toString(stack.stackArr));
//		System.out.println("top() 는 "+stack.top());
//		System.out.println("empty() 는 " +stack.empty());
//		System.out.println("size() 는 "+stack.size());
	}

}
