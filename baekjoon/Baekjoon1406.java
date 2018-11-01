package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input= br.readLine();
		int count = Integer.parseInt(br.readLine());
		LinkedList<Character> stack =new LinkedList<Character>();
		StringTokenizer command = null;
		
		for(int i=0;i<input.length();i++) {
			stack.add(input.charAt(i));
		}
		int cursor= input.length()-1;
		for(int j=0;j<count;j++) {
			command = new StringTokenizer(br.readLine());
			String head = command.nextToken();
			String body ;
			if(head.equals("L")) {
				if(cursor>=0) 
					cursor-=1;
			}else if(head.equals("D")) {
				if(cursor!=stack.size()-1)
					cursor+=1;
			}else if(head.equals("B")) {
				if(cursor>=0) {
					stack.remove(cursor);
					cursor-=1;
				}
			}else if(head.equals("P")) {
				body = command.nextToken();
				if (cursor+1 == stack.size()) {
					for (int k = 0; k < body.length(); k++) {
						stack.add(body.charAt(k));
						cursor+=1;
					}
				}else if(cursor==0) {
					for (int k = 0; k < body.length(); k++) {
						stack.addFirst(body.charAt(k));
						cursor+=1;
					}
				}else {
					for (int k = 0; k < body.length(); k++) {
						cursor += 1;
						stack.add(cursor, body.charAt(k));
					}
				}
				
			}
				
		}
		for(int i=0;i<stack.size();i++) {
			System.out.print(stack.get(i));
		}
	}

}
