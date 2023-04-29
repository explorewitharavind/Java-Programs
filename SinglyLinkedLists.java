public class SinglyLinkedLists {
    private Listnode head;
   private static class Listnode
   {
    private int data;
    private Listnode next;
    public Listnode(int data)
    {
        this.data = data;
        this.next = null;
    }
   }
   public void Display()
   {
    Listnode current = head;
    while(current!=null)
    {
      System.out.print(current.data+"---->");
      current = current.next;
    }
   System.out.println("null");
   }
   
public static void main(String[] args) {
    SinglyLinkedLists ob = new SinglyLinkedLists();
    ob.head  = new Listnode(100);
    Listnode first = new Listnode(100);
    Listnode second = new Listnode(50);
    Listnode third = new Listnode(0);
    
    ob.head.next = first;
    first.next = second;
    second.next = third;
    ob.Display();
   }
}
