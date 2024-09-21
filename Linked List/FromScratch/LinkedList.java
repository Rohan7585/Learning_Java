package FromScratch;

public class LinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null)    head = newNode;
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        if(head == null)    System.out.println("The Linked List is empty.");
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
    }

    public void InsertAtTheBeginning(int data){
        Node newNode = new Node(data);
        if(head == null)    head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
}
