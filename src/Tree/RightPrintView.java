package Tree;

import java.util.ArrayList;
import java.util.List;

public class RightPrintView {
    public void rightArray(binary.Node root){
        List<Integer> array=new ArrayList<>();
        RightPrintView(root, 0, array);
        traversalRightPrintView(array);
    }
    public void RightPrintView(binary.Node root, int level, List<Integer> array){
        if(root==null){
            return;
        }
        if(level==array.size()){
            array.add(root.data);
        }
        RightPrintView(root.rightChild, level+1, array);
        RightPrintView(root.leftChild, level+1, array);

    }
    public void traversalRightPrintView(List<Integer> array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        RightPrintView treeTime=new RightPrintView();
        binary.Node root1=binary.buildTree(node);
        treeTime.rightArray(root1);
    }
}
