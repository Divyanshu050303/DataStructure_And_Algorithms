package Tree;

public class diameterOfTheTreeApproach2 {
    static class treeInformation1{
        int height, diameter;
        treeInformation1(int height, int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }
    public treeInformation1 diameter2(binary.Node root){
        if(root==null){
            return new treeInformation1(0, 0);
        }
        treeInformation1 leftTree=diameter2(root.leftChild);
        treeInformation1 rightTree=diameter2(root.rightChild);
        int myHeight=Math.max(leftTree.height, rightTree.height)+1;

        int leftDiameter=leftTree.height;
        int rightDiameter=rightTree.height;

        int rootDiameter=leftDiameter+rightDiameter+1;


        int myDiameter=Math.max(Math.max(leftDiameter, rightDiameter), rootDiameter);
        return new treeInformation1(myHeight, myDiameter);

    }

    public static void main(String[] args) {
        diameterOfTheTreeApproach2 tree=new diameterOfTheTreeApproach2();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        System.out.println(tree.diameter2(root).diameter);
    }
}
