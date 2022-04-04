package Tree;

public class lowestCommonAncestor {
    public binary.Node lowest(binary.Node root, binary.Node p, binary.Node q){
        if(root==null || root==p || root==q){
            return root;
        }
        binary.Node leftChild=lowest(root.leftChild, p, q);
        binary.Node rightChild=lowest(root.rightChild, p, q);
        if(leftChild==null){
            return rightChild;
        }
        else if(rightChild==null){
            return leftChild;
        }
        else {
            return root;
        }
    }

    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        lowestCommonAncestor treeTime=new lowestCommonAncestor();
        binary.Node root1=binary.buildTree(node);
        binary.Node p=new binary.Node(2);
        binary.Node q=new binary.Node(3);
        System.out.println( treeTime.lowest(root1, p, q));

    }
}
