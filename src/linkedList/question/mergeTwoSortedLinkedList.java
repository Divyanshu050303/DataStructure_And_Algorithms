package linkedList.question;
class merge{
    private Node head;
    public static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    // this is the actual solution
    public static merge mergeLinkedList(merge first, merge second)
    {
        Node firstHead=first.head;
        Node secondHead= second.head;
        merge ans=new merge();
        while (firstHead!=null && secondHead!=null)
        {
            if(firstHead.value<secondHead.value)
            {
                ans.insertLast(firstHead.value);
                firstHead=firstHead.next;
            }
            else {
                ans.insertLast(secondHead.value);
                secondHead=secondHead.next;
            }
        }
        while (firstHead!=null)
        {
            ans.insertLast(firstHead.value);
            firstHead=firstHead.next;
        }
        while (secondHead!=null)
        {
            ans.insertLast(secondHead.value);
            secondHead=secondHead.next;
        }
        return ans;

    }

    private void insertLast(int value) {
    }
}
public class mergeTwoSortedLinkedList {
}
