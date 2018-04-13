package problem;

import java.util.Arrays;

public class Problem4_3 {
//2차원 배열 A(5,5)의 원소에 모래시계 모양으로 값을 저장해주는 알고리즘을 제시하시오
//1  2  3  4  5
//   6  7  8
//      9
//   10 11 12
//13 14 15 16 17
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array=new int[5][5];
		int value=1;
		
		for(int i=0;i<5;i++) {
			if(i<3) {
				for(int j=i;j<5-i;j++) {
					array[i][j]=value;
					value++;
				}
			}else {
				for(int j=5-i-1;j<i+1;j++) {
					array[i][j]=value;
					value++;
				}
			}
		}
		System.out.println(Arrays.deepToString(array));
	}

}
