package FromScratch;

public class LinkedList {
    Node head;
    
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

    public void InsertAtTheBeginning(int data){
        Node newNode = new Node(data);
        if(head == null)    head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void InsertAtGivenPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 0)    System.out.println("Position can't be 0");
        else if(head == null || position == 1)    head = newNode;
        else{
            Node previousNode = head;
            Node temp = head.next;
            while(position>2 && temp!=null){
                previousNode = temp;
                temp = temp.next;
                position--;
            }
            if(position==2 && temp == null)  previousNode.next = newNode;
            else if(position>2 && temp==null)    System.out.println("Entered positionition is an invalid positionition.");
            else{
                previousNode.next = newNode;
                newNode.next = temp;
            }
        }   
    }

    public void DeleteFirstNode(){
        
    }

    public void DeleteLastNode(){

    }

    public void DeleteGivenNode(int position){
        
    }

    public void DeleteByValue(int value){

    }

    public int SearchByValue(int value){
        int count = -1;
        if(head == null)    System.out.println("The Linked List is empty.");
        else{
            Node temp = head;
            count = 1;
            while(temp != null){
                if(temp.data == value)  break;
                temp = temp.next;
                count++;
            }
            try{
                if(temp.data == value)  return count;
                else    System.out.println("Entered value is not found");
            }catch(NullPointerException e){
                System.out.println("Entered value is not found");
            }
        }
        return -1;
    }

    public int SearchByPosition(int position){
        Node temp = head;
        int count = 1;
        while(count<position && temp!=null){
            temp = temp.next;
            count++;
        }
        if(count == position) return temp.data;
        else    System.out.println("Entered position isn't a valid position");
        return -1;
    }
}
