class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    private Node head;
    public LinkedList1() {
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
        LinkedList1 linkedList = new LinkedList1();
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(7);
        linkedList.insertAtBeginning(9);
        System.out.print("Linked List: ");
        linkedList.display();
    }
}
