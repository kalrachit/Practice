import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class findingSizebyStack {
	
	
	
	private int finddep(Node root){
		if(root==null)
			return 0;
		int leftdep = finddep(root.left);
		int rightdep = finddep(root.right);
		
		
		return(leftdep > rightdep)? leftdep+1 : rightdep +1;
	}
	
	private int findDepbyQueue(Node root){
		if(root ==null)
			return 0;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		q.offer(null);
		int maxdep=1;
		while(!q.isEmpty()){
			Node curr = q.poll();
			if (curr != null){
				if (curr.left == null && curr.right ==null){
					return maxdep;
				}
				if (curr.left != null){
					q.offer(curr.left);}
				if (curr.right!= null){
					q.offer(curr.right);}
			}
			else{
				if(!q.isEmpty()){
					maxdep++;
					q.offer(null);
					}
				}
			}
			return maxdep;
		}
			
		
	
	private int findSizebyStack(Node root){
		if (root == null)
			return 0;
		Stack<Node> s =new Stack<Node>();
		s.push(root);
		int maxdep = 0;
		Node prev = null;
		while(!s.isEmpty()){
			Node curr = s.peek();
			if (prev == null||prev.left == curr||prev.right==curr){
				if(curr.left!=null)s.push(curr.left);
				else if(curr.right!=null)s.push(curr.right);
			}else if(curr.left ==prev){
				if(curr.right !=null) s.push(curr.right);
			}
			else
				s.pop();
			prev =curr;
			if(s.size()> maxdep)
				maxdep =s.size();
			
				
		}
		
		
		
		return maxdep;
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
		
		findingSizebyStack st = new findingSizebyStack();
		System.out.println(st.finddep(a1));
		System.out.println(st.findSizebyStack(a1));
		System.out.println(st.findDepbyQueue(a1));
	}
	

}
