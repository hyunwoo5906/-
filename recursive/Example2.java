package net.skhu.recursive;
//재귀 호출 - 1부터 n까지 합계를 계산하는 sum 함수 구현
public class Example2 {

	static int sum(int n) {
		if(n<=1)
			return 1;
		return n+sum(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 3; i <= 10; ++i)
            System.out.printf("%d %d\n", i, sum(i));

	}

}
