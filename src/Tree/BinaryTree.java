package Tree;
import java.util.Scanner;
import java.util.*;
class binary {
    // This is the binary Node class
    static class Node {
        int data;
        Node leftChild;
        Node rightChild;
        Node next;
        Node previous;
        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
            this.next=null;
        }
    }
    static int idx = -1, time=0;
    // to Build the binary tree
    public static Node buildTree(int[] node) {
        idx++;
        if (node[idx] == -1) {
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.leftChild = buildTree(node);
        newNode.rightChild = buildTree(node);
        return newNode;
    }
    public Node inputTreeNode(){
        Scanner sc=new Scanner(System.in);
        Queue<Node> q=new LinkedList<>();
        int rootDat=sc.nextInt();
        Node root=new Node(rootDat);
        q.add(root);
        while (!q.isEmpty()){
            var currentNode=q.remove();
            if(currentNode==null)
                break;
            int leftChild= sc.nextInt();
            int rightChild=sc.nextInt();
            if(leftChild!=-1){
                currentNode.leftChild=new Node(leftChild);
                q.add(currentNode.leftChild);
            }
            if(rightChild!=-1){
                currentNode.rightChild=new Node(rightChild);
                q.add(currentNode.rightChild);
            }
        }
        return root;

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
        return new treeInformation(myHeight, myDiameter);
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
    // Convert the Tree into Singly linked list
    Node head;
    Node tail;
    public void insert(Node node){
        if(node!=null){
            Node newNode=new Node(node.data);
            if(head==null){
                head=newNode;
            }
            else {
                tail.next=newNode;
            }
            tail=newNode;
        }
    }
    public void inOrderLinkedList(Node root){
        if(root==null){
            return;
        }
        insert(root);
        inOrderLinkedList(root.leftChild);
        inOrderLinkedList(root.rightChild);
    }
    public void traversalLinkedList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    // Convert the tree into Doubly Linked List
    public void insertDoublyLinkedList(Node node){
        Node newNode=new Node(node.data);
        if(node!=null){
            if(head==null){
                head=newNode;
                newNode.previous=null;
            }
            else {
                tail.next=newNode;
                newNode.previous=tail;
            }
            tail=newNode;
        }
    }
    public void traverseDoublyLinkedList(){
        Node node=head;
        System.out.println("This list is in forward order");
        while (node!=null)
        {
            System.out.print(node.data+"->");
            tail=node;
            node=node.next;
        }
        System.out.println();
        System.out.println("The list is in reverse order");
        while (tail!=null)
        {
            System.out.print(tail.data+"<-");
            tail=tail.previous;
        }
        System.out.println();
    }
    public void inOrderDoublyLinkedList(Node root){
        if(root==null){
            return;
        }
        insertDoublyLinkedList(root);
        inOrderDoublyLinkedList(root.leftChild);
        inOrderDoublyLinkedList(root.rightChild);
    }
    public boolean searchNode(Node root, int searchKey){
        if(root==null){
            return false;
        }
        else if(root.data==searchKey){
            return true;
        }
        else if(root.data>searchKey){
            return searchNode(root.leftChild, searchKey);
        }
        else{
            return searchNode(root.rightChild,searchKey );
        }
    }
    public Node DeleteTheNode(Node root, int key){
        if(root==null){
            return null;
        }
        if(key<root.data){
            root.leftChild=DeleteTheNode(root.leftChild, key);
        }
        else if(key>root.data){
            root.rightChild=DeleteTheNode(root.rightChild, key);
        }
        else{
            if(root.leftChild==null){
                return root.rightChild;
            }
            else if(root.rightChild==null){
                return root.rightChild;
            }
            root.data=minimumValue(root.rightChild);
            root.rightChild=DeleteTheNode(root.rightChild, root.data);
        }
        return root;
    }
    public int minimumValue(Node root){
        int minValue=root.data;
        while (root.leftChild!=null){
            minValue=root.leftChild.data;
            root=root.leftChild;
        }
        return minValue;
    }
    class vPair{
        Node node=null;
        int h1=0;
        vPair(Node node, int h1){
            this.node=node;
            this.h1=h1;
        }
    }
    public List<List<Integer>> verticalOrderTraversal(Node root){
        LinkedList<vPair> que=new LinkedList<>();
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        int minh1=0, maxh1=0;
        List<List<Integer>> ans=new ArrayList<>();
        que.addLast(new vPair(root, 0));
        while (que.size()!=0){
            int size=que.size();
            while (size-->0){
                vPair rp=que.removeFirst();
                maxh1=Math.max(maxh1, rp.h1);
                minh1=Math.min(minh1, rp.h1);
                map.putIfAbsent(rp.h1, new ArrayList<>());
                map.get(rp.h1).add(rp.node.data);
                if(rp.node.leftChild !=null)
                    que.addLast(new vPair(rp.node.leftChild, rp.h1-1));

                if(rp.node.rightChild !=null)
                    que.addLast(new vPair(rp.node.rightChild, rp.h1+1));
            }
        }
        for (int i = minh1; i <= maxh1; i++) {
            ans.add(map.get(i));
        }
        return ans;
    }
    public void ZigZagTraversal(Node root){
        if(root==null){
            return;
        }
        Stack<Node> currentLevel=new Stack<>();
        Stack<Node> nextLeve=new Stack<>();
        currentLevel.push(root);
        boolean leftToRight=true;
        while (!currentLevel.isEmpty()){
            Node node=currentLevel.pop();
            System.out.print(node.data+" ");
            if(leftToRight){
                if(node.leftChild!=null){
                    nextLeve.push(node.leftChild);
                }
                if(node.rightChild!=null){
                    nextLeve.push(node.rightChild);
                }
            }
            else{
                if(node.rightChild!=null){
                    nextLeve.push(node.rightChild);
                }
                if(node.leftChild!=null){
                    nextLeve.push(node.leftChild);
                }
            }
            if(currentLevel.isEmpty()){
                leftToRight=!leftToRight;
                Stack<Node> temp=currentLevel;
                currentLevel=nextLeve;
                nextLeve=temp;
            }
        }
    }
    public void topViewOfTree(Node root){
        class QueClass{
            Node node;
            int hd;
            QueClass(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        Queue<QueClass> q=new LinkedList<>();
        Map<Integer, Node> topView=new TreeMap<>();
        if(root==null){
            return;
        }
        q.add(new QueClass(root, 0));
        while (!q.isEmpty()){
            QueClass tempNode=q.poll();
            if(!topView.containsKey(tempNode.hd)){
                topView.put(tempNode.hd, tempNode.node);
            }
            if(tempNode.node.leftChild!=null){
                q.add(new QueClass(tempNode.node.leftChild, tempNode.hd-1));
            }
            if(tempNode.node.rightChild!=null){
                q.add(new QueClass(tempNode.node.rightChild, tempNode.hd+1));
            }
        }
        for(Map.Entry<Integer, Node> entry:topView.entrySet()){
            System.out.print(entry.getValue().data+" ");
        }
    }
    public void downView(Node root){
        if(root==null){
            return;
        }
        int hd;
        Map<Integer, Integer> map=new TreeMap<>();
        Queue<Node> queue=new LinkedList<>();

    }
    public void rightArrayList(Node root){
        List<Integer> arrayList=new ArrayList<>();
        rightPrintView(root, 0, arrayList);
        rightPrintTraversal(arrayList);

    }
    public void rightPrintView(Node root, int level, List<Integer> arrayList){
        if(root==null){
            return;
        }
        if(level==arrayList.size()){
            arrayList.add(root.data);
        }
        rightPrintView(root.rightChild, level+1, arrayList);
        rightPrintView(root.leftChild, level+1, arrayList);

    }
    public void rightPrintTraversal(List<Integer> arrayList){
        for(int i :arrayList){
            System.out.print(i+" ");
        }
    }
    public void LeftArrayList(Node root){
        List<Integer> arrayList=new ArrayList<>();
        leftPrintView(root, 0, arrayList);
        leftPrintTraversal(arrayList);

    }
    public void leftPrintView(Node root, int level, List<Integer> arrayList){
        if(root==null){
            return;
        }
        if(level==arrayList.size()){
            arrayList.add(root.data);
        }
        leftPrintView(root.leftChild, level+1, arrayList);
        leftPrintView(root.rightChild, level+1, arrayList);

    }
    public void leftPrintTraversal(List<Integer> arrayList){
        for(int i :arrayList){
            System.out.print(i+" ");
        }
    }
}
public class BinaryTree {
    public static void main(String[] args) {

        binary tree=new binary();
        binary.Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Press 1 -> to user entered tree \n press 2 -> go with predefine tree");
        int chi=sc.nextInt();
        if(chi==1){

                root= tree.inputTreeNode();
        }
        else if(chi==2){

                int []nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
                root=tree.buildTree(nodes);
        }
        else {
            System.out.println("Wrong choice");
        }
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
            System.out.println("Press 13 -> Convert the Tree into Singly Linked List");
            System.out.println("Press 14 -> Convert the Tree into Doubly Linked List");
            System.out.println("Press 15 -> Search the Node in the tree");
            System.out.println("Press 16 -> Delete the node from the tree");
            System.out.println("Press 17 -> Vertical order traversal ");
            System.out.println("Press 18 -> ZigZag order traversal ");
            System.out.println("Press 19 -> Top view of the tree");
            System.out.println("Press 20 -> Print Right View using preOrder");
            System.out.println("Press 21 -> Print Left View using preOrder");
            System.out.println("Press 22-> exit");
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
                    System.out.println("After the converting ");
                    tree.inOrderLinkedList(root);
                    tree.traversalLinkedList();
                    break;
                }
                case 14:{
                    System.out.println("After Converting");
                    tree.inOrderDoublyLinkedList(root);
                    tree.traverseDoublyLinkedList();
                    break;
                }
                case 15:{
                    System.out.println(tree.searchNode(root, 7)+" Node present in the tree");
                    break;
                }
                case 16: {
                    System.out.println("Before delete the node the tree is : ");
                    tree.inOrder(root);
                    System.out.println("\n After  delete the node from the tree");
                    tree.DeleteTheNode(root, 20);
                    tree.inOrder(root);
                    break;
                }
                case 17:{
                    System.out.println("Vertical order traversal");
                    System.out.println(tree.verticalOrderTraversal(root));
                    break;
                }
                case 18:{
                    System.out.println("Zigzag order traversal");
                    tree.ZigZagTraversal(root);
                    break;
                }
                case 19:{
                    System.out.println("Top view of the tree is ...");
                    tree.topViewOfTree(root);
                    break;
                }
                case 20:{
                    System.out.println("Print Right View ...");
                    tree.rightArrayList(root);
                    System.out.println();
                    break;
                }
                case 21:{
                    System.out.println("Print Left View ...");
                    tree.LeftArrayList(root);
                    System.out.println();
                    break;
                }
                case 22:{
                    System.exit(0);
                }
            }
        }
    }
}
