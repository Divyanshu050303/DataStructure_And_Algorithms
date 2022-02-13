package linkedList.question;
class command
{
    private Node head;
    private static class Node
    {
        private  String value;
        private Node next;
        Node(String value)
        {
            this.value= value;
        }

    }

    public void positive()
    {
        Node temp=head;
        String str="";
        while (temp.next != null)
        {
            int n=Integer.parseInt(temp.value);
            if(n>0&&n%2==0)
            {
                str+="E";
            }
            else if(n%2!=0)
            {
                str+='O';
            }
            else if(n<0)
            {
                str+="N";
            }
            else
            {
                str+="Z";
            }
            temp=temp.next;

        }
        System.out.println(str);
    }
    public void insert(String val) {

        Node node =new Node(val);
        node.value=val;
        if (head == null) {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
        temp.next=node;
        }
    }
}
public class commandlinr {
    public static void main(String[] args) {
        command c=new command();
        String s=args[0];

        for (int i = 0; i <s.length() ; i++)
        {
            if (s.charAt(i) == '-')
            {
                c.insert(s.charAt(i)+""+s.charAt(i+1));
                i+=1;
            }
            else {
                c.insert( s.charAt(i)+"");
            }
        }
        c.positive();
    }
}
