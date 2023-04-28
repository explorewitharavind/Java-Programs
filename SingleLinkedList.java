public class SingleLinkedList
{
    private Listnode head;
    private static class Listnode{
        private int data ;
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
    SingleLinkedList ob = new SingleLinkedList();
    ob.head = new Listnode(10);
    Listnode first = new Listnode(10);
    Listnode second = new Listnode(9);
    Listnode third = new Listnode(8);
    ob.head.next = second;
    second.next = third;
    ob.Display();


    
}
}