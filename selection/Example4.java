package sort.selection;
//배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
public class Example4 {

	static int findMin(int[] a,int start) {
		int min=999; //임의의 큰수
		int index=0;
		if(a.length>start) {
			for(int i=start;i<a.length;i++) {
				if(a[i]<=min) {
					index=i;
					min=a[i];
				}
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {14,11,13,15};
		
		for(int i =0;i<a.length;i++) {
			int minIndex=findMin(a,i);
			System.out.println(a[minIndex]);
		}
	}

}
