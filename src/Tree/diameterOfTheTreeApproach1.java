package Tree;

import javax.management.NotificationEmitter;

public class diameterOfTheTreeApproach1 {
    public int diameter1(binary.Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter=diameter1(root.leftChild);
        int rightDiameter=diameter1(root.rightChild);
        int rootDiameter= heightOfTheTree.height(root.leftChild)+  heightOfTheTree.height(root.rightChild) +1;
        int maximumDiameter;
        maximumDiameter=Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
        return maximumDiameter;

    }

    public static void main(String[] args) {
        diameterOfTheTreeApproach1 tree=new diameterOfTheTreeApproach1();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        System.out.println(tree.diameter1(root));
    }
}
