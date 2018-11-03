import java.util.LinkedList;
import java.util.Queue;


public class inorderTopostorder {
	
	
	public Node reverseOrder (Node node){
		
		
		
		return node;
	}
	
	
	
	public static void main(String args[]){
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(5);
		Node a6 = new Node(6);
		Node a7 = new Node(7);
	
		
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right= a7;
		
		print(a1);
		
	}



	private static void print(Node a1) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(a1);
		StringBuilder sbr = new StringBuilder();
		while(!queue.isEmpty()){
			Node node = queue.peek();
			process(node,queue,sbr);
			queue.poll();
		}
		
		sbr.reverse();
		System.out.println(sbr.toString());
	}



	private static void process(Node node, Queue<Node> queue, StringBuilder sbr) {
		sbr.append(node.data);
		if(node.right!=null){
			queue.add(node.right);
		}
		if(node.left!=null){
			queue.add(node.left);
		}
		
	}
	
	
	

}
