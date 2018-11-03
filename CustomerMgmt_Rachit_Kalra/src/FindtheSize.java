
public class FindtheSize {
	
	
	public int findSize(Node root){
		int leftCount = root.left == null ? 0: findSize(root.left); 
		int rightCount = root.right == null ? 0: findSize(root.right); 
		return 1 + leftCount+ rightCount;
	}
	
	
	
	public static void main(String args[]){
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(9);
		Node a6 = new Node(6);
		Node a7 = new Node(7);
		Node a8 = new Node(8);
		Node a9 = new Node(9);
		
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right= a7;
		a4.left=a8;
		a4.right=a9;
		
		System.out.println(new FindtheSize().findSize(a1));
	
		
	}
	
	

}
