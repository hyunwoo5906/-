package problem;
//소수 판별
//1부터 100사이에서 가장큰 소수를 구하는 알고리즘을 제시하라
public class Problem3_4 {
	
	static int primeNumber(int a,int b) {
		int maxPN=0;
		for(int i=a;i<=b;i++) {
			if(i<=3) maxPN=i;
			else {
				int sqrtValue=(int)Math.sqrt(i);
				for(int k=2;k<=sqrtValue;k++) {
					if(i%k==0) break;
					if(k==sqrtValue) maxPN=i;
				}
			}
		}
		return maxPN;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pn = primeNumber(1,100);
		System.out.println(pn);
	}

}
