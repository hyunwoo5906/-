package sort.selection;

import java.util.Arrays;
//선택 정렬 구현
public class Example1 {
	
	//배열 a에서 i위치와 j 위치의 값을 서로 바꾼다.
	static void swap(int[] a,int i ,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	//배열 a의 start위치 부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
	static int findMin(int[] a, int start) {
		int index=0;
		int minValue=999;
		for(int i=start;i<a.length;i++) {
			if(a[i]<minValue) {
				index=i;
				minValue=a[i];
			}
		}
		return index;
	}
	
	static void selectionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int minIndex = findMin(a,i);
			swap(a,i,minIndex);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {17,14,11,19,13,15,18,12,16,20};
		
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
