package Tree;

public class inOrderMorrisTraversal {
    public void inorderMorris(binary.Node root){
        if(root==null){
            return;
        }
        binary.Node current=root;
        while (current!=null){
            if(current.leftChild==null){
                System.out.print(current.data+" ");
                current=current.rightChild;
            }
            else{
                binary.Node predecessor=current.leftChild;
                while (predecessor.rightChild!=current && predecessor.rightChild!=null){
                    predecessor=predecessor.rightChild;
                }
                if(predecessor.rightChild==null){
                    predecessor.rightChild=current;
                    current=current.leftChild;
                }
                else{
                    System.out.print(current.data+" ");
                    current=current.rightChild;
                }
            }
        }
    }

    public static void main(String[] args) {
        inOrderMorrisTraversal tree=new inOrderMorrisTraversal();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        tree.inorderMorris(root);
    }
}
