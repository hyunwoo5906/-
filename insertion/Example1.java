package sort.insertion;

import java.util.Arrays;
//삽입 정렬 구현
public class Example1 {
	static void insertionSort(int[] a) {
		for(int i =1;i<a.length;i++) {	//인덱스 1부터 앞부분에 삽입할 자리 설정
			int value=a[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(a[j]>value)
					a[j+1]=a[j];
				else
					break;
			
			}
			a[j+1]=value;
			
		}
		
	}
	//i의 위치 보다 앞에있는 인덱스와 비교해서 들어갈위치 정하고
	//한칸씩 뒤로 밀고 그인덱스에 값대입
	public static void main(String[] args) {
		int[] a= {17,14,11,19,13,15};
		
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
