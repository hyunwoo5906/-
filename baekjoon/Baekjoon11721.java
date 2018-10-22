package baekjoon;

import java.util.Scanner;

public class Baekjoon11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		String text = input.nextLine();
		for(int i=0;i<text.length();i++) {
			if(i%10==0 && i!=0)
				System.out.println();
			System.out.print(text.charAt(i));
		}
		}

}
