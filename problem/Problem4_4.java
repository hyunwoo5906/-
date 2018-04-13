package problem;

import java.util.Arrays;

public class Problem4_4 {
//2차원배열 A(5,5)의 원소에 1부터 25까지의 번호를 달팽이 모양으로 배열을 채우는 알고리즘을 제시하라
//1  2  3  4  5
//16 17 18 19 6
//15 24 25 20 7
//14 23 22 21 8
//13 12 11 10 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = new int[5][5];
		int toggle = 1 ;
		int value = 0;
		int repeat=5;
		int row=0;
		int column=-1;
		
		while(true) {
			for(int i=0;i<repeat;i++) {
				value++;
				column+=toggle;
				array[row][column]=value;
				System.out.println(row +" " + column +" "+ value);
			}
			repeat-=1;
			if(repeat<=0)
				break;
			for(int j=0;j<repeat;j++) {
				row+=toggle;
				value++;
				System.out.println(row +" " + column +" "+ value);
				array[row][column]=value;	
			}
			toggle*=-1;
		}
		System.out.println(Arrays.deepToString(array));
	}

}
