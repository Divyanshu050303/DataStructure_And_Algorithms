package Tree;

public class countTheNode {
    public int count(binary.Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.leftChild);
        int rightCount=count(root.rightChild);
        return leftCount+rightCount+1;
    }
    public static void main(String[] args) {

        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        countTheNode treeTime=new countTheNode();
        binary.Node root1=binary.buildTree(node);
        System.out.print(treeTime.count(root1));

    }
}
