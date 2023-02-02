package linkedList.question;



class tiem{
     class Node {
         Node next;
         int data;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
         Node head;
         Node prev;
         public void insert(int data){
             Node newNode=new Node(data);
             if(head==null){
                 head=newNode;
                 return;
             }
             Node temp=head;
             while (temp.next!=null){
                 temp=temp.next;
             }
             temp.next=newNode;
         }
//         public void removeFromTheLast(int n){
//             Node temp=head;
//
//             while (temp.next!=null){
//                 temp=temp.next;
//             }
//             for(int i=0;i<n;i++){
//                 temp.p
//             }
//         }
         public void print(){
             Node temp=head;
             while (temp!=null){
                 System.out.print(temp.data+" ");
                 temp=temp.next;
             }
         }
    public Node removeNthFromEnd( int n) {
        if(head.next==null)
        {
            head=null;
        }
        Node temp=reverse(head);
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        else{
            temp.next=null;
        }

        return head;

    }
    public Node reverse(Node head){
        Node prev=null;
        Node present=head;
        Node next=present.next;
        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        return prev;
    }

}
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        tiem r=new tiem();
        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.insert(4);
        r.insert(5);
        r.print();
    }
}
