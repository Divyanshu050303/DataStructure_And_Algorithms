package Tree;

public class TreePruning {
    public binary.Node treePruning(binary.Node root){
        if(root==null){
            return null;
        }
        root.leftChild=treePruning(root.leftChild);
        root.rightChild=treePruning(root.rightChild);
        if(root.leftChild!=null || root.rightChild!=null){
            return root;
        }
        if(root.data==-1){
            return null;
        }
        return root;
    }

    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreePruning treeTime=new TreePruning();
        binary.Node root1=binary.buildTree(node);
        System.out.println( treeTime.treePruning(root1).data);
    }
}
