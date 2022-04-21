package Tree;

public class sumOfNode {
    public int sum(binary.Node root){
        if(root==null){
            return 0;
        }
        int sumOfLeftChild=sum(root.leftChild);
        int sumOfRightChild=sum(root.rightChild);
        return sumOfLeftChild+sumOfRightChild+root.data;
    }

    public static void main(String[] args) {
        sumOfNode Tree=new sumOfNode();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        System.out.println(Tree.sum(root));
    }
}
