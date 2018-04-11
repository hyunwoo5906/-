package problem;

public class Problem3_7 {
//4부터 500까지의 자연수 중에서 완전수를 찾아 출력하고 그개수를 구하는 알고리즘을 제시하라
//완전수는 자기 자신을 뺀 약수들의 합이 자기 자신과 같아지는 수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=4;i<=500;i++) {	//4~500
			int sum=0;
			for(int j=1;j<=i/2;j++) {	//약수를 구할 때 1부터 그값의 절반값까지만 나누어보면
										//자신의 제외한 모든 약수를 구할수 있다.
				if(i%j==0) 	//자연수가 j로 나누어 떨어지면 약수
					sum+=j;
			}
			if(sum==i) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}

}
