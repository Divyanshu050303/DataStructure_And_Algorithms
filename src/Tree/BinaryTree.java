package Tree;
import java.util.Scanner;
import java.util.*;
class binary {
    // This is the binary Node class
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
    // to Build the binary tree
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
    // To print in preorder
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    // to print in  inorder
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.leftChild);
        System.out.print(root.data+" ");
        inOrder(root.rightChild);
    }
    // to print in postorder
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.data+" ");
    }
    // to print in level order
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
    // to count the number of node in the tree
    public int countOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countOfNode(root.leftChild);
        int rightCount=countOfNode(root.rightChild);
        return leftCount+rightCount+1;
    }
    // to calculate the sum of the node
    public int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNode(root.leftChild);
        int rightSUm=sumOfNode(root.rightChild);
        return leftSum+rightSUm+root.data;
    }
    // to calculate the height of the tree
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.leftChild);
        int rightHeight=height(root.rightChild);
        int height = Math.max(leftHeight, rightHeight);

        return height+1;
    }
    // to calculate the diameter of the tree
    public int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diameterLeft=diameter(root.leftChild);
        int diameterRight=diameter(root.rightChild);
        int rootDiameter=height(root.leftChild)+height(root.rightChild)+1;
        int maximumDiameter;
        if(diameterLeft>diameterRight && diameterLeft>rootDiameter){
            maximumDiameter=diameterLeft;
        }
        else if(diameterRight>diameterLeft && diameterRight>rootDiameter){
            maximumDiameter=diameterRight;
        }
        else {
            maximumDiameter=rootDiameter;
        }
        return maximumDiameter;
    }
    // to calculate the diameter of the tree we create a reference
    static class treeInformation{
        int height, diameter;
        treeInformation(int height, int diameter){
            this.diameter=diameter;
            this.height=height;
        }
    }
    public treeInformation diameterApproach2OofN2(Node root){
        if(root==null){
            return new treeInformation(0, 0);
        }
        treeInformation leftTree=diameterApproach2OofN2(root.leftChild);
        treeInformation rightTree=diameterApproach2OofN2(root.rightChild);

        int myHeight=Math.max(leftTree.height, rightTree.height)+1;

        int leftDiameter= leftTree.height;
        int rightDiameter=rightTree.height;

        int rootDiameter=leftDiameter+rightDiameter+1;

        int myDiameter=Math.max(Math.max(leftDiameter, rightDiameter), rootDiameter);
        treeInformation treeinfo= new treeInformation(myHeight, myDiameter);
        return treeinfo;
    }
    // to calculate the minimum node from the tree
    public Node Minimum(Node root){
        Node current;
        Node last = null;
        current =root;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last;
    }
    // to print in inorder in Morris form
    public void inOrderMorris(Node root){
        Node current=root;
        while(current!=null){
            if(current.leftChild==null){
                System.out.print(current.data+" ");
                current=current.rightChild;
            }
            else{
                Node predecessor=current.leftChild;
                while(predecessor.rightChild!=current && predecessor.rightChild!=null){
                    predecessor=predecessor.rightChild;
                }
                if(predecessor.rightChild==null){
                    predecessor.rightChild=current;
                    current=current.leftChild;
                }else{
                    predecessor.rightChild=null;
                    System.out.print(current.data+" ");
                    current=current.rightChild;
                }
            }
        }
    }
    // to print in preOrder in Morris form
    public void  preOrderMorris(Node root){
        Node current=root;
        while (current!=null){
            if(current!=null){
                System.out.print(current.data+" ");
                current=current.rightChild;
            }
            else {
                Node predecessor=current.leftChild;
                while (predecessor.rightChild!=current && predecessor.rightChild!=null){
                    predecessor=predecessor.rightChild;
                }
                if(predecessor.rightChild==null){
                    predecessor.rightChild=current;
                    System.out.print(current.data+" ");
                    current=current.leftChild;
                }else{
                    predecessor.rightChild=null;
                    current=current.rightChild;
                }
            }
        }
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
            System.out.println("Press 8 -> Diameter of the tree Approach 1");
            System.out.println("Press 9 -> Diameter of the tree Approach 2");
            System.out.println("Press 10 -> Find the Minimum value in the tree");
            System.out.println("Press 11 -> Find the inOrderMorris traversal");
            System.out.println("Press 12 -> find the preOrderMorris traversal");
            System.out.println("Press 13 -> exit");
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
                    System.out.println("Diameter of the tree Approach 1");
                    System.out.println(tree.diameter(root));
                    break;
                }
                case 9:{
                    System.out.println("Diameter of the tree Approach 2");
                    System.out.println(tree.diameterApproach2OofN2(root).diameter);
                    break;
                }
                case 10:{
                    System.out.println("Minimum value in the tree");
                    System.out.println(tree.Minimum(root).data);
                    break;
                }
                case 11:{
                    System.out.println("inOrderMorris traversal is :");
                    tree.inOrderMorris(root);
                    break;
                }
                case 12:{
                    System.out.println("preOrderMorris traversal is :");
                    tree.preOrderMorris(root);
                    break;
                }
                case 13:{
                    System.exit(0);
                }
            }
        }
    }
}
