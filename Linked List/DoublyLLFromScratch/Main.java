package DoublyLLFromScratch;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.InsertAtTheBeginning(05);
        dll.display();
        dll.InsertAtGivenPosition(50, 1);
        dll.display();
    }
}
