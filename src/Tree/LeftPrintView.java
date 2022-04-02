package Tree;

import java.util.ArrayList;
import java.util.List;

public class LeftPrintView {
    public void LeftArray(binary.Node root){
        List<Integer> array=new ArrayList<>();
        LeftPrintView(root, 0, array);
        traversalLeftPrintView(array);
    }
    public void LeftPrintView(binary.Node root, int level, List<Integer> array){
        if(root==null){
            return;
        }
        if(level==array.size()){
            array.add(root.data);
        }
        LeftPrintView(root.leftChild, level+1, array);
        LeftPrintView(root.rightChild, level+1, array);

    }
    public void traversalLeftPrintView(List<Integer> array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        LeftPrintView treeTime=new LeftPrintView();
        binary.Node root1=binary.buildTree(node);
        treeTime.LeftArray(root1);
    }
}
