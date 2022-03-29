package Tree;

import java.util.Stack;

public class ZigZagOrderTraversal {
    public void zigzag(binary.Node root){
        if(root==null){
            return;
        }
        Stack<binary.Node> currentLevel=new Stack<>();
        Stack<binary.Node> nextLevel=new Stack<>();
        currentLevel.push(root);
        boolean leftToRight=true;
        while (!currentLevel.isEmpty()){
            binary.Node node=currentLevel.pop();
            System.out.print(node.data+" ");
            if(leftToRight){
                if(node.leftChild!=null){
                    nextLevel.push(node.leftChild);
                }
                if(node.rightChild!=null){
                    nextLevel.push(node.rightChild);
                }
            }
            else{
                if(node.rightChild!=null){
                    nextLevel.push(node.rightChild);
                }
                if(node.leftChild!=null){
                    nextLevel.push(node.leftChild);
                }
            }
            if(currentLevel.isEmpty()){
                leftToRight=!leftToRight;
                Stack<binary.Node> temp=currentLevel;
                currentLevel=nextLevel;
                nextLevel=temp;
            }
        }
    }
    public static void main(String[] args) {
        ZigZagOrderTraversal tree=new ZigZagOrderTraversal();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        tree.zigzag(root);
    }
}
