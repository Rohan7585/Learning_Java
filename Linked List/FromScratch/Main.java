package FromScratch;

public class Main {
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(10);
        list1.display();
        list1.InsertAtTheBeginning(90);
        list1.display();
        System.out.println(list1.SearchByPosition(0));
    }
}
