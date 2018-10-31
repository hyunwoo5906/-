package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10828_stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.empty());
		stack.push(30);
		stack.push(90);
		stack.pop();
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		System.out.println(stack.search(30));
		
	}


}
