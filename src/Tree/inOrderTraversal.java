package Tree;

public class inOrderTraversal {
    public void inOrder(binary.Node root){
        if(root==null){
            return;
        }
        inOrder(root.leftChild);
        System.out.print(root.data+" ");
        inOrder(root.rightChild);

    }

    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        inOrderTraversal treeTime=new inOrderTraversal();
        binary.Node root1=binary.buildTree(node);
        treeTime.inOrder(root1);


    }
}
