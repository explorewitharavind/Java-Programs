public class CountLinkedListNodes {
    private ListNode Head;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void Display()
    {
        int count = 0;
        ListNode current = Head;
        while(current!=null)
        {
            System.out.print(current.data+"---->");
            current = current.next;
            count ++;
        }
        System.out.print("Null");
        System.out.println();
        System.out.println("Number of Linked List Nodes are "+count);
    }
    public static void main(String[] args) 
    {
        CountLinkedListNodes ob = new CountLinkedListNodes();
        ob.Head = new ListNode(10);
        ListNode first = new ListNode(20);
        ListNode second = new ListNode(30);
        ob.Head.next = first;
        first.next = second;
        ob.Display();
    }
}
