import java.util.* ;

public class QueueWithTwoStacks<E> {
    
    public static void main( String[] args)
    {
    
        MyQueue<String> mq = new MyQueue<String>();

        mq.offer("1");
        mq.offer("2");
        mq.offer("3");

        mq.printQueue();

        mq.poll();
        mq.printQueue();
    
        mq.offer("4");
        mq.printQueue();

        mq.poll();
        mq.printQueue();
    }

    private Stack<E> stackIn = new Stack<E>();
    private Stack<E> stackOut = new Stack<E>();

    public boolean offer( E e)
    {
        // If stackout is not empty 
        // we need to push all elements 
        // back to stackIn 
        while( !stackOut.empty())
            stackIn.push(stackOut.pop());
        stackIn.push(e);
        return true;
    }

    public E poll()
    {
       while( !stackIn.empty()) 
           stackOut.push(stackIn.pop());

       return stackOut.pop();
    }

    public void printQueue()
    {
        while( !stackIn.empty()) 
           stackOut.push(stackIn.pop());

        while( !stackOut.empty())
        {
            E e =  stackOut.pop();
            System.out.print(e);
            stackIn.push( e);
        }
    
        System.out.println();
    }

}
