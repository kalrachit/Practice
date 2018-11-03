import java.util.LinkedList;
import java.util.Queue;


public class deepestNodeinBT {
	
	private Node findLastNode(Node root){
		Node tmp= null;
		if(root ==null)
			return null;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty()){
			tmp = q.poll();

				if (tmp.left != null){
					q.offer(tmp.left);}
				if (tmp.right!= null){
					q.offer(tmp.right);}
				}
			return tmp;
	}
	
	private int numberofLeafs(Node root){
		int count =0;
		if(root == null)
			return 0;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty()){
			Node tmp =q.poll();
			if (tmp.left == null&& tmp.right == null)
				count++;
			if (tmp.left!=null)
				q.offer(tmp.left);
			if (tmp.right!=null)
				q.offer(tmp.right);	
		}
		return count;
	}
	
	
	private int totalNumbofNodes(Node root)
	{
		int count = 0;
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty()){
			Node tmp =q.poll();
			if (tmp.left!= null && tmp.right != null)
				count++;
			if (tmp.left!=null)
				q.offer(tmp.left);
			if (tmp.right!=null)
				q.offer(tmp.right);	
		}
		return count;
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
		Node ans;
		deepestNodeinBT dn = new deepestNodeinBT();
		ans =dn.findLastNode(a1);
		System.out.println(ans.data);
		System.out.println(dn.numberofLeafs(a1));
		System.out.println(dn.totalNumbofNodes(a1));
		
	}

}
