package Tree;

public class ConvertTreeInToSinglyLikedList {
    binary.Node head;
    binary.Node tail;
    public void insertLinkedList(binary.Node node){
        if(node!=null){
            binary.Node newNode=new binary.Node(node.data);
            if(head==null){
                head=newNode;
            }
            else{
                tail.next=newNode;
            }
            tail=newNode;
        }
    }
    public void inOrderLinkedList(binary.Node root){
        if(root==null){
            return;
        }
        insertLinkedList(root);
        inOrderLinkedList(root.leftChild);
        inOrderLinkedList(root.rightChild);
    }
    public void LinkedListTraversal(){
        binary.Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ConvertTreeInToSinglyLikedList tree=new ConvertTreeInToSinglyLikedList();
        int []node={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary.Node root=binary.buildTree(node);
        tree.inOrderLinkedList(root);
        tree.LinkedListTraversal();
    }
}
