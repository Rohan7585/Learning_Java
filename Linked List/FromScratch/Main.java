package FromScratch;

public class Main {
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(20);
        list1.add(10);
        list1.display();
        list1.InsertAtGivenPosition(44, 5);
        list1.display();
        //list1.InsertAtTheBeginning(90);
        //list1.display();
        //System.out.println(list1.SearchByPosition(0));
        //list1.UpdateValue(8, 999);
        //list1.CountLength();
        //list1.DeleteLastNode();
        // list1.display();
        // list1.DeleteGivenNode(5);
        //list1.display();
        //System.out.println("This Linked List is a palindorme Linked List: "+ IsPalindrome.isPalindrome(list1));
        
    }
}
