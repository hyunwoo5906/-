package problem;

import java.util.Arrays;

public class Problem4_2 {
//2차원 배열 A(5,5)읜 원소에 삼각형 모양으로 값을 저장해주는 알고리즘을 제시하라
//1 2 3  4  5
//  6 7  8  9
//    10 11 12
//		 13 14
//          15
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array=new int[5][5];
		int value =1;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				array[i][j]=value;
				value++;
			}
		}
		
		System.out.println(Arrays.deepToString(array));
	}

}
