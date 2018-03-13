package net.skhu.recursive;
//재귀 호출 팩토리얼 구현
public class Example1 {

	static int factorial(int n) {
		if(n<=1)
			return 1;
		return n* factorial(n-1);
	}
	
	public static void main(String[] args) {
		for(int i=3;i<=10;i++)
			System.out.printf("%d %d \n",i,factorial(i));
	}
}
