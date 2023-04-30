public class InsertNodeAtTheBeginingInSLL {
    private ListNode Head;
    private static class ListNode
    {
        private int data ;
        private ListNode next;
        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void Display()
    {
        ListNode current = Head;
        while(current!=null)
        {
            System.out.print(current.data+"---->");
            current = current.next;
        }
        System.out.print("NULL");
    }
    public void InsertNewHead(int value)
    {
        ListNode newListNode = new ListNode(value);
        newListNode.next = Head;
        Head = newListNode;
    }
    public static void main(String[] args) 
    {
        InsertNodeAtTheBeginingInSLL ob = new InsertNodeAtTheBeginingInSLL();
        ob.InsertNewHead(7);
        ob.Display();
        
    }
}
