package net.skhu.recursive;
//printAll메소드  구현 -반복문 , 재귀
public class Example3 {

	static class Node{
		int value;
		Node next;
		
		public Node(int value,Node next) {
			this.value = value;
			this.next =next;
		}
		
		public void printAll() {
			System.out.println(this.value);
			if(next!=null)
				next.printAll();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		for(int i=1;i<=10;++i)
			root=new Node(i,root);
		
		root.printAll();
	}

}
