package linkedList.question;

public class deleteTheMiddleElement {
    NodeClass head;
    public void insertLinkedList(int data){
        NodeClass newNode=new NodeClass(data);
        if(head==null){
            head=newNode;
            return;
        }
        NodeClass temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void traversal(){
        NodeClass temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void deleteMiddle(){
        NodeClass slow=head;
        NodeClass fast=head;
        while (fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        NodeClass temp=head;
        while (temp.next!=slow){
            temp=temp.next;
        }
        temp.next=slow.next;
    }

    public static void main(String[] args) {
        deleteTheMiddleElement d=new deleteTheMiddleElement();
        for (int i = 1; i <=5 ; i++) {
            d.insertLinkedList(i);
        }
        d.traversal();
        d.deleteMiddle();
        d.traversal();
    }
}
