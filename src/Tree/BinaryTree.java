package Tree;
import java.util.Scanner;
import java.util.*;
class binary {
    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    static int idx = -1;

    public Node buildTree(int[] node) {
        idx++;
        if (node[idx] == -1) {
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.leftChild = buildTree(node);
        newNode.rightChild = buildTree(node);
        return newNode;
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.leftChild);
        System.out.print(root.data+" ");
        inOrder(root.rightChild);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.data+" ");
    }
    public void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node current=q.remove();
            if(current==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(current.data+" ");
                if(current.leftChild!=null){
                    q.add(current.leftChild);
                }
                if(current.rightChild!=null){
                    q.add(current.rightChild);
                }
            }
        }
    }
    public int countOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countOfNode(root.leftChild);
        int rightCount=countOfNode(root.rightChild);
        return leftCount+rightCount+1;
    }
    public int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNode(root.leftChild);
        int rightSUm=sumOfNode(root.rightChild);
        return leftSum+rightSUm+root.data;
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.leftChild);
        int rightHeight=height(root.rightChild);
        int height;
        if(leftHeight<rightHeight){
            height=rightHeight;
        }else {
           height=leftHeight;
        }

        return height+1;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        int []nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary tree=new binary();
        binary.Node root=tree.buildTree(nodes);
        Scanner sc=new Scanner(System.in);
        while (true){

            System.out.println("Press 1 -> PreOrder");
            System.out.println("Press 2 -> InOrder");
            System.out.println("Press 3 -> PostOrder");
            System.out.println("Press 4 -> LevelOrder");
            System.out.println("Press 5 -> Count the node in the tree");
            System.out.println("Press 6 -> Sum of the node in the tree");
            System.out.println("Press 7 -> Height of the tree");
            System.out.println("Press 8 -> exit");
            System.out.println();
            System.out.println("Enter you choice");
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("PerOrder element print");
                    tree.preOrder(root);
                    break;
                }
                case 2:{
                    System.out.println("InOrder element print");
                    tree.inOrder(root);
                    break;
                }
                case 3:{
                    System.out.println("PostOrder element print");
                    tree.postOrder(root);
                    break;
                }
                case 4:{
                    System.out.println("Level order element print");
                    tree.levelOrder(root);
                    break;
                }
                case 5:{
                    System.out.println("Count the node of the tree");
                    System.out.println(tree.countOfNode(root));
                    break;
                }
                case 6:{
                    System.out.println("Sum of the tree");
                    System.out.println(tree.sumOfNode(root));
                    break;
                }
                case 7:{
                    System.out.println("Height of the tree");
                    System.out.println(tree.height(root));
                    break;
                }
                case 8:{
                    System.exit(0);
                }
            }
        }
    }
}
