package linkedList;
import java.util.Scanner;

class Node {
    int rollNo;
    Node next;
}

public class linkedListDemo {

    Node START;
    linkedListDemo () {

    }
    void insert() {
        System.out.print("Enter ur Roll Number: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node newNode = new Node();
        newNode.rollNo = data;
        newNode.next = null;

        if(START == null) {
            START = newNode;
        }
        else {
            Node current;
            current = START;
            // Searching for the last node.
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void delete() {

    }

    void traverse() {
        if(START == null) {
            System.out.println("List Empty!");
        }
        else {
            System.out.println("-----List Elements-----");
            Node current;
            for (current = START; current != null; current = current.next) {
                System.out.print(" " + current.rollNo);
            }
        }
    }

    public static void main(String[] args) {
        linkedListDemo obj = new linkedListDemo();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("""

                    Press 1 for insert
                    Press 2 for delete
                    Press 3 for traverse
                    Press 4 to exit
                    Enter your choice :\s""");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.traverse();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Choice !");
            }
        }
    }
}
