public class MyLinkedList {

    public static void main( String[] args)
    {
        MyLinkedList ml = new MyLinkedList();
        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);
        ml.add(5);

        ml.loop();

        ml.reverse();

    }


    private Node head = new Node(0);
   
    public void add( int data )
    {
        Node node = new Node(data);
        if( head.next == null)
            head.next = node ;
        else{
            node.next = head.next ;
            head.next = node ;
        }
    }

    public void reverse()
    {
        Node current = head.next ;
        Node reverse = new Node(0);
        if( current == null )
            System.out.println("empty list");
        else{
            while( current.next != null )
            {
                Node next = current.next ;
                current.next = reverse.next ;
                reverse.next = current ;
                current = next;
            }

        
        }

        current = reverse;
        while( current.next != null)
        {
            current = current.next;
            System.out.print( current.d);
        }

        System.out.println();
    
    }

    public void loop()
    {
        Node current = head ;
        while( current.next != null)
        {
            current = current.next;
            System.out.print( current.d);
        }

        System.out.println();
    }


    class Node{
        int d ;
        Node next;

        public Node( int d )
        {
            this.d = d;
            next = null; 
        }
    }


}
