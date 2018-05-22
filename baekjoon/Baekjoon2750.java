//백준 2750번
//수 정렬하기 
//문제 : N개의 수가 주어졌을 때 , 이를 오름 차순으로 정렬하는 프로그램을 작성하시오 삽입정렬, 버블정렬 등
//입력 : 첫째 줄에 수의 개수 n이 주어진다. 둘째 줄 부터 n새의 줄에는 숫자가 주어진다. 
//		이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한줄에 하나씩 출력한다.

package baekjoon;
import java.util.Arrays;
import java.util.Scanner;


public class Baekjoon2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count;
		count = input.nextInt();
		
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = input.nextInt();
		}
		// 버블정렬
		for (int j = count; j> 0; j--) {
			for (int i = 0; i < count - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
