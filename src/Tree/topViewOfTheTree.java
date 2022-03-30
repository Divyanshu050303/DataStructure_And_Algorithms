package Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class topViewOfTheTree {
    public void topView(binary.Node root){
        class QueClass{
            final binary.Node node;
            final int hd;
            QueClass(binary.Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        Queue<QueClass> q=new LinkedList<>();
        Map<Integer, binary.Node> TopView=new TreeMap<>();
        if(root==null){
            return ;
        }
        q.add(new QueClass(root, 0));
        while (!q.isEmpty()){
            QueClass tempNode=q.poll();
            if(!TopView.containsKey(tempNode.hd)){
                TopView.put(tempNode.hd,tempNode.node);
            }
            if(tempNode.node.leftChild!=null){
                q.add(new QueClass(tempNode.node.leftChild, tempNode.hd-1));
            }
            if(tempNode.node.rightChild!=null){
                q.add(new QueClass(tempNode.node.rightChild, tempNode.hd+1));
            }
        }
        for(Map.Entry<Integer, binary.Node>entry:TopView.entrySet()){
            System.out.print(entry.getValue().data+" ");
        }
    }
    public static void main(String[] args) {
        topViewOfTheTree tree=new topViewOfTheTree();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        tree.topView(root);
    }
}
