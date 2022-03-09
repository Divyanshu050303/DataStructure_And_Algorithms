package Tree;
class tree {
    Node head;
    class Node {
        int data;
        double doubleData;
        Node leftChild;
        Node rightChild;
    }
    public void insert(int id, double dd) {
        Node newNode=new Node();
        newNode.data=id;
//        newNode.doubleData=dd;
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node temp=head;
            Node parent;
            while (true)
            {
                parent=temp;
                if(id<temp.data)
                {
                    temp=temp.leftChild;
                    if(temp==null)
                    {
                        parent.leftChild=newNode;
                        return;
                    }
                }
                else{
                    temp=temp.rightChild;
                    if(temp==null)
                    {
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }

    }
    public Node find(int key) {
        Node temp=head;
        while (temp.data!=key) {
            if(temp==null) {
                return null;
            }
            if(key<temp.data) {
                temp=temp.leftChild;
            }
            else{
                temp=temp.rightChild;
            }
        }
        return temp;
    }
    public boolean delete(int key) {
        Node temp=head;
        Node parent=head;
        boolean isLeftChild=true;
        while (temp.data!=key)
        {
            parent=temp;
            if(key<temp.data)
            {
                isLeftChild=true;
                temp=temp.leftChild;
            }
            else{
                isLeftChild=false;
                temp=temp.rightChild;
            }

        }
            return false;
    }
    public void traversingInOrder(Node head1){

        if(head1!=null)
        {
            traversingInOrder(head1.leftChild);
            System.out.print(head1.data+" ");
            traversingInOrder(head1.rightChild);
        }
    }
}
public class treeDemo {
}
