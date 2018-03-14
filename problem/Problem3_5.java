package problem;

import java.util.Scanner;

//소인수 분해
//자연수 N을 입력 받아 소인수 분해하여 그결과를 출력하는 알고리즘을 제시하라
//-입력받은 값 n은 1000이하의 자연수 라고 가정한다
//-입력받은 정수 n이 2보다 작으면 알고리즘을 종료한다
//-입력받은 정수 n이 소수이면 '소수'라고 출력한다.
//-입력받은 정수 n이 소수가 아니면 소인수 분해한 결과를 출력한다
//-단계별로 소인수 분해한 결과를 배열에 저장해 두었다가 나중에 한꺼번에 출력한다
public class Problem3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("자연수를 입력하시오:");
		int num=input.nextInt();
		
		int[] a = new int[10];
		int t=0;
		
		do {
			if(num>=2) {
				int p=2;
				for(;p<=num;p++)
					if(num%p == 0) break;
				a[t]=p;
				num=num/p;
				t++;
			}else
				return;
		}while(num!=1);
		if(t==1)
			System.out.println("소수");
		else {
			for(int j=0;j<t-1;j++)
				System.out.print(a[j]+"*");
			System.out.println(a[t-1]);
		}
	}

}
