package Tree;

public class maximumPathSum {
    public int maxPathSum(binary.Node root){
        int []maxValue=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];

    }
    public int maxPathDown(binary.Node root, int []maxValue){
        if(root==null){
            return 0;
        }
        int left=Math.max(0, maxPathDown(root.leftChild, maxValue));
        int right=Math.max(0, maxPathDown(root.rightChild, maxValue));
        maxValue[0]=Math.max(maxValue[0], left+right+root.data);
        return Math.max(left, right)+root.data;
    }
    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        maximumPathSum treeTime=new maximumPathSum();
        binary.Node root1=binary.buildTree(node);
        System.out.println(treeTime.maxPathSum(root1));


    }
}
