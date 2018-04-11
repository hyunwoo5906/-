package problem;

import java.util.Scanner;

public class Problem3_8 {
// 유클리드 호제법에 의하여 두정수 의 최대공약수를 구하는 알고리즘을 제시하시오
	
	static int greatCommon(int x,int y) {
		if(y==0) return x;
		return greatCommon(y,x%y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x , y;
		System.out.printf("정수 입력 : ");
		x=input.nextInt();
		System.out.printf("정수 입력 :");
		y=input.nextInt();
		
		if(x<y) {	//순서 바꿔주기
			int temp=x;
			x=y;
			y=temp;
		}
		
		
		System.out.println(x +"와" +y +"의 최대공약수 는 "+greatCommon(x,y));
	}

}
