package net.skhu.array;
//insert 메소드 구현
//배열 a 에서 index 위치 뒤의 값들을 한 칸씩 뒤로 밀고 index위치에 value를 넣어라

public class Example1 {

    static void print(int[] a) {
        for (int i : a)
            System.out.printf("%d ", i);
    }

    static void insert(int[] a, int index, int value) {
    	for(int i=a.length-1;i>index;i--) {
    		a[i]=a[i-1];
    	}
    	a[index]=value;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = i;

        insert(a, 5, -99);

        print(a);
    }

}
