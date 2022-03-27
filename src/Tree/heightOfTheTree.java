package Tree;

public class heightOfTheTree {
    public static int height(binary.Node root){
        if(root==null){
            return 0;
        }
        int leftChildHeight=height(root.leftChild);
        int rightChildHeight=height(root.rightChild);
        int height=Math.max(leftChildHeight, rightChildHeight);
        return height+1;
    }

    public static void main(String[] args) {
        heightOfTheTree tree=new heightOfTheTree();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        System.out.println(height(root));
    }
}
