package Tree;

public class preOrderMorrisTraversal {
    public void preOrderTraversal1(binary.Node root){

        binary.Node current=root;
        while (current!=null) {
            if (current != null) {
                System.out.print(current.data + " ");
                current=current.rightChild;
            }
            else{
                binary.Node predecessor=current.leftChild;
                while (predecessor.rightChild!=current && predecessor.rightChild!=null){
                    predecessor=predecessor.rightChild;
                }
                if(predecessor.rightChild==null){
                    predecessor.rightChild=current;
                    System.out.print(current.data+" ");
                    current=current.rightChild;
                }
                else {
                    predecessor.rightChild=null;
                    current=current.leftChild;
                }
            }
        }
    }

    public static void main(String[] args) {
        preOrderMorrisTraversal tree=new preOrderMorrisTraversal();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);

        tree.preOrderTraversal1(root);
    }
}
