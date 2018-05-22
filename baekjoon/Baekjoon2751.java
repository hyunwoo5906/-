//백준 2751번
//수 정렬하기 2
//문제 : N개의 수가 주어졌을 때 , 이를 오름 차순으로 정렬하는 프로그램을 작성하시오 병합정렬 or 힙정렬 등
//입력 : 첫째 줄에 수의 개수 n이 주어진다. 둘째 줄 부터 n새의 줄에는 숫자가 주어진다. 
//		이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한줄에 하나씩 출력한다.
package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2751 {

	static void mergeSort(int[] array,int start ,int end) {
		if(start == end)
			return ;
		int middle = (start + end) / 2;
		mergeSort(array, start, middle);
		mergeSort(array, middle + 1, end);
		int[] temp = new int[end-start+1];
		int i=0;
		for (int j = start; j < end+1; j++) {
			temp[i++] = array[j];
		}
		Arrays.sort(temp);
		
		for(int k=0;k<temp.length;k++) {
			array[k+start]=temp[k];
		}
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count ;
		Scanner input =new Scanner(System.in);
		count =input.nextInt();
		int[] array= new int[count];
		for(int i=0; i<count;i++) {
			array[i]=input.nextInt();
		}
		mergeSort(array,0,array.length-1);
		
		for(int i=0;i<count;i++) {
			System.out.println(array[i]);
		}
	}

}
