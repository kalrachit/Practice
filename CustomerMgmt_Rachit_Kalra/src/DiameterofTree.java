
public class DiameterofTree {
	
	private int diameterofTree(Node root){
		int left,right;
		if(root==null)
			return 0;
		left = diameterofTree(root.left);
		right = diameterofTree(root.right);
		int diameter = 0;
		if(left+right>diameter)
			diameter = left+right;
			return Math.max(left, right)+1;
	}
	
	private int widthofTree(Node root){
		int max =0;
		for(int k =0; k<=diameterofTree(root); k++){
			int tmp = width(root,k);
			if(tmp > max)max=tmp;
		}
		return max;
	}
	public int width(Node root, int dep){
		if(root==null){
			return 0;
			
		}else 
			if (dep ==0)
				return 1;
			else
				return width(root.left, dep-1) +width(root.right, dep-1);
	}
	
	public static void main(String args[]){
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(5);
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
		
		
		
		DiameterofTree dt = new DiameterofTree();
		
		System.out.println(dt.diameterofTree(a1));
		System.out.println(dt.widthofTree(a1));
	}

}
