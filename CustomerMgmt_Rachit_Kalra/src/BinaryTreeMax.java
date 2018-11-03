

class Node 
{ 
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
public class BinaryTreeMax {
	
	public static void main(String args[]) {

		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(9);
		Node a6 = new Node(6);
		Node a7 = new Node(7);
		
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right= a7;
		
		System.out.println(new BinaryTreeMax().Findmax(a1));
		System.out.println(new BinaryTreeMax().findmax2(a1));
		
		
	}
	int max = 0;
	public int Findmax(Node root){

			if (root == null)
				return max;
			if (root!=null){
				if (root.data>max)
					max=root.data;
			}
			Findmax(root.right);
			Findmax(root.left);
	return max;
	}
	
	public int findmax2(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int data = root.data;

		data = Math.max(data, findmax2(root.left));
		data = Math.max(data, findmax2(root.right));

		return data;
	}

}
