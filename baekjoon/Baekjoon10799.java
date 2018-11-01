package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baekjoon10799 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int sum=0;	//잘린 쇠막대기의 갯수 합계	
		LinkedList<Character> list = new LinkedList<Character>();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') 			//push
				list.add('(');
			else if(input.charAt(i)==')') {		//pop
				list.pop();
				if(input.charAt(i-1)=='(')
					sum+=list.size();
				else
					sum+=1;
			}
		}
		System.out.println(sum);
	}

}
