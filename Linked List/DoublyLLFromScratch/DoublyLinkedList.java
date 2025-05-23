package DoublyLLFromScratch;

import DoublyLLFromScratch.Node;

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

    }


/*=======================
Delete Node from the Linked List
========================*/
    public void DeleteFirstNode(){

    }

    public void DeleteLastNode(){

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
