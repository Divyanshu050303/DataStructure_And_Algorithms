//package Tree.question;
//
//import java.util.ArrayList;
//
//class Node {
//    int data;
//    Node left, right;
//    Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right=null;
//    }
//    static Node root;
//}
//public class KthSmallestNodeInTheBinaryTree {
//    public <root> Node insertLevelOrder(int[] arr , Node root ,int i)
//    {
//        // Base case for recursion
//        if (i < arr.length) {
//            Node temp = new Node(arr[i]);
//            root = temp;
//
//            // insert left child
//            root.left = insertLevelOrder(arr, root.left,2 * i + 1);
//
//            // insert right child
//            root.right = insertLevelOrder(arr, 2 * i + 2);
//        }
//        return root;
//    }
//    static ArrayList<Integer> array=new ArrayList<>();
//    public void inOrder(Node root){
//        if(root==null){
//            return;
//        }
//        inOrder(root.left);
////        System.out.print(root.data+" ");
//        array.add(root.data);
//        inOrder(root.right);
//
//    }
//
//    public static void main(String[] args) {
//        KthSmallestNodeInTheBinaryTree t2 = new KthSmallestNodeInTheBinaryTree();
//        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
//        Node.root = t2.insertLevelOrder(arr, 0);
//        t2.inOrder(Node.root);
//        t2.inOrder(Node.root);
//        System.out.println(array);
//
//    }
//}
