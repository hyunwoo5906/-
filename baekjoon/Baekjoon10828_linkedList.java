package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;


class StackLink {
	private class Node{
		int data;
		Node nextNode;
		public Node(int data) {
			super();
			this.data = data;
			this.nextNode = null;
		}
	}
	Node top =null;
	int count =0;
	public void push(int num) {
		Node node =new Node(num);
		node.nextNode=top;
		top =node;
		count+=1;
	}
	public int pop() {
		if(top==null)
			return -1;
		else {
			int temp=top.data;
			top=top.nextNode;
			count-=1;
			return temp;
		}
	}
	public int size() {
		return count;	
	}
	public int empty() {
		if(top==null)
			return 1;
		else 
			return 0;
	}
	public int top() {
		if(top==null)
			return -1;
		else
			return top.data;
	}
	
}

public class Baekjoon10828_linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int count =input.nextInt(); //명령어의 갯수 입력받기
		StackLink stack = new StackLink();
		
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
	}

}
