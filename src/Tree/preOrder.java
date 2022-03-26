package Tree;

public class preOrder {

    public void preOrder(binary.Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.leftChild);

        preOrder(root.rightChild);

    }

    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        preOrder treeTime=new preOrder();
        binary.Node root1=binary.buildTree(node);
        treeTime.preOrder(root1);


    }
}
