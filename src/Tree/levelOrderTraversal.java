package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
    public void levelOrder(binary.Node root){
        if(root == null){
            return;
        }
        Queue<binary.Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            binary.Node current=q.remove();
            if(current==null){
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(current.data+" ");
                if(current.leftChild!=null){
                    q.add(current.leftChild);
                }
                if(current.rightChild!=null){
                    q.add(current.rightChild);
                }
            }
        }
    }
    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        levelOrderTraversal treeTime=new levelOrderTraversal();
        binary.Node root1=binary.buildTree(node);
        treeTime.levelOrder(root1);
    }
}
