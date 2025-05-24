package FromScratch;

public class LinkedList {
    Node head;
    

/*=======================
Traverse The Linked List
========================*/
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
        else if(head == null && position == 1)    head = newNode;
        else if(head != null && position == 1){
            newNode.next = head;
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
            if(position==2 && temp == null)  previousNode.next = newNode;
            else if(position>2 && temp==null)    System.out.println("Entered positionition is an invalid positionition.");
            else{
                previousNode.next = newNode;
                newNode.next = temp;
            }
        }   
    }


/*=======================
Delete Node from the Linked List
========================*/
    public void DeleteFirstNode(){
        if(head == null)    System.out.println("The Linked List is empty.");
        else if(head.next == null)  head = null;
        else{
            head = head.next;
        }  
    }

    public void DeleteLastNode(){
        if(head == null)    System.out.println("The Linked List is empty.");
        else if(head.next == null)  head = null;
        else{
            Node prevNode = head;
            Node current = head.next;
            while(current.next!=null){
                prevNode = current;
                current = current.next;
            }
            prevNode.next = null;
        } 
    }

    public void DeleteGivenNode(int position){
        if(head == null)    System.out.println("The Linked List is empty.");
        else if(position == 1)  head = head.next;
        else{
            Node prevNode = head;
            Node current = head.next;
            int count = 2;
            while(current.next!=null && count<position){
                prevNode = current;
                current = current.next;
                count++;
            }
            if(count == position)   prevNode.next = current.next;
            else   System.out.println("Enterd position isn't valid");
        }
    }

    public void DeleteByValue(int value){
        if(head == null)    System.out.println("The Linked List is empty.");
        else if ( head.data == value)   head = head.next;
        else{
            Node prev = head;
            Node temp = head.next;
            while(temp != null){
                if(temp.data == value){
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            if(temp == null)    System.out.println("Entered value isn't valid");
            else    prev.next = temp.next;
        } 
    }


/*=======================
Search Value from the Linked List
========================*/
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


/*=======================
Update Value of a node
========================*/
    public void UpdateValue(int position, int data){
        Node current = head;
        if(head == null)    System.out.println("The linked List empty");
        else{
            int count = 1;
            while(count<position && current!=null){
                current = current.next;
                count++;
            }
            if(count == position && current != null)   current.data = data;
            else    System.out.println("Entered position isn't valied");
        }
    }


/*=======================
Count the nodes (length)
========================*/
    public int CountLength(){
        int length = 0;
        if(head == null)    System.out.println("The Linked List is empty");
        else{
            Node current = head;
            while(current!=null){
                length++;
                current = current.next;
            }
            System.out.print("The length of this Linked List is " + length);
        }
        return length;
    }
}