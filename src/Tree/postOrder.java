package Tree;

public class postOrder {
    public void inOrder(binary.Node root){
        if(root==null){
            return;
        }
        inOrder(root.leftChild);
        inOrder(root.rightChild);
        System.out.print(root.data+" ");

    }

    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        postOrder treeTime=new postOrder();
        binary.Node root1=binary.buildTree(node);
        treeTime.inOrder(root1);


    }
}
