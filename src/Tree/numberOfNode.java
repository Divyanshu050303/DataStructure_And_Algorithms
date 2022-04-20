package Tree;

import java.util.ArrayList;

class number{
    class Node{
        Node left, right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx;
    public Node buildTree(int[] node) {

        if (idx>node.length-1) {
            return null;
        }
        Node newNode = new Node(node[idx]);
        idx++;
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);
        return newNode;
    }
    ArrayList<Integer> array=new ArrayList<>();
    public void preOrder(Node root){
        if(root==null){
            return ;
        }

        preOrder(root.left);
        array.add(root.data);
        preOrder(root.right);

    }
}
public class numberOfNode {
    public static void main(String[] args) {
        number n=new number();
        int[]node={1,2,3,4,5};
        number.Node root=n.buildTree(node);
        System.out.println(n.array);
    }
}
