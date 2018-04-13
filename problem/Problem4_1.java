package problem;
import java.util.Arrays;

public class Problem4_1 {
//2차원 배열 A(5,5)의 원소에 다음과 같은 모습으로 값을 저장하는 알고리즘을 제시하라
//1 6  11 16 21
//2 7  12 17 22
//3 8  13 18 23
//4 9  14 19 24
//5 10 15 20 25
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array =new int[5][5];
		int value=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				array[j][i]=value;
				value++;
			}
		}
		System.out.println(Arrays.deepToString(array));
	}

}
