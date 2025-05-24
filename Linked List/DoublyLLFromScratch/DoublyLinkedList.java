package DoublyLLFromScratch;

public class DoublyLinkedList {
    Node head = null;

/*=======================
Traverse The Linked List
========================*/
    public void display(){
        Node current = head;
        Node previous = null;
        while (current != null) {
            System.out.print(current.data + " -> ");
            previous = current;
            current = current.next;
        }
        System.out.print("null \n");
        System.out.print("null");
        while (previous != null) {
            System.out.print(" <- " + previous.data);
            previous = previous.prev;
        }
        System.out.println();
    }
    

/*=======================
Insert value in the Linked List
========================*/
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null)    head = newNode;
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void InsertAtTheBeginning(int data){
        Node newNode = new Node(data);
        if(head == null)    head = newNode;
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void InsertAtGivenPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 0)    System.out.println("Position can't be 0");
        else if(head == null && position == 1)    head = newNode;
        else if(head != null && position == 1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }    
        else{
            Node previousNode = head;
            Node temp = head.next;
            while(position>2 && temp!=null){
                previousNode = temp;
                temp = temp.next;
                position--;
            }
            if(position==2 && temp == null){
                previousNode.next = newNode;
                newNode.prev = previousNode;
            }
            else if(position>2 && temp==null)    System.out.println("Entered positionition is an invalid positionition.");
            else{
                previousNode.next = newNode;
                newNode.prev = previousNode;
                newNode.next = temp;
                temp.prev = newNode;
            }
        }
    }


/*=======================
Delete Node from the Linked List
========================*/
    public void DeleteFirstNode(){
        if(head == null)    System.out.println("This Doubly LinkedList is empty");
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void DeleteLastNode(){
        if(head == null)    System.out.println("This Doubly LinkedList is empty");
        else{
            Node currNode = head.next;
            Node previousNode = head;
            while(currNode.next != null){
                previousNode = currNode;
                currNode = currNode.next;
            }
            previousNode.next = null;
            currNode.prev = null;
        }
    }

    public void DeleteGivenNode(int position){

    }

    public void DeleteByValue(int value){

    }


/*=======================
Search Value from the Linked List
========================*/
    public int SearchByValue(int value){
        return 0;
    }

    public int SearchByPosition(int position){
        return 0;
    }


/*=======================
Update Value of a node
========================*/
    public void UpdateValue(int position, int data){
    
    }


/*=======================
Count the nodes (length)
========================*/
    public int CountLength(){
        return 0;
    }
}
