class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = null;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(7);
        linkedList.insertAtBeginning(9);
        System.out.print("Linked List: ");
        linkedList.display();
    }
}
