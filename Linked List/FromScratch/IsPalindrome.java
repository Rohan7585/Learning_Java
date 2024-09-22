package FromScratch;

public class IsPalindrome {
    public static boolean isPalindrome(LinkedList list){
        if(list.head == null){
            System.out.println("The Linked List is empty.");
            return false;
        }    
        if(list.head.next == null)  return true;
        if(list.head.next.next == null)   return (list.head.data == list.head.next.data)?true:false;
        Node head = list.head;
        Node left, PrevRight, right;
        left = PrevRight =head;
        right = head.next;
        while(left.next!=null){
            while(right.next!=null){
                PrevRight = right;
                right = right.next;
            }
            if(left.data != right.data) return false;
            PrevRight.next = null;
            left = left.next;
            if(left.next == PrevRight){
                if(left.data != PrevRight.data) return false;
                break;
            }   
            PrevRight =left;
            right = left.next;
        }
        return true;
    }
}
