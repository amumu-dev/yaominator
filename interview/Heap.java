import java.util.*;

public class Heap<E extends Comparable >{

    public static void main( String[] args )
    {

        Heap<Integer> heap = new Heap<Integer>();

        heap.add(3); 
        heap.add(5); 
        heap.add(1); 
        heap.add(19); 
        heap.add(11); 
        heap.add(2); 
        heap.add(8); 
        heap.add(8); 
        heap.add(2); 

        while( heap.getSize() > 0 )
            System.out.print( "   " + heap.remove());

       System.out.println();
    }

    private ArrayList<E> list = new ArrayList<E>();

    public void add(E item )
    {
    // how to add item to a heap 
    // first, add to the last one 
    // siftup 
    // or you can add to the first, then sift down 

        // now we are using sift up 

        list.add( item); // append to the last 

        int size = list.size() ;
        // if only one ,we just add and leave 
        if( size == 1 ) return ; 

        int current = size -1 ;

        while( current > 0 )
        {
            int parent = (current -1) / 2;
            assert parent >= 0 : " Out of bound !!!";  

            if( list.get(parent).compareTo( list.get(current)) < 0 )
            {
                // we need to switch 
                E tmp = list.get(parent);
                list.set( parent , list.get(current) );
                list.set( current , tmp ) ;
            }
            else 
                break;

            current = parent ;
        }

    }

    public int getSize()
    {
    
        return list.size();
    }


    
    public E remove()
    {
        // how to remove 
        // switch the last one , then sift down 

        int size = list.size();

        if( size == 0 )
            return null ;
        else if ( size == 1)
        {
            return list.remove( size - 1 );
        }
        else{
            E e = list.get(0);
            // switch the first and the last one 
            list.set( 0 , list.get(size-1));

            // remove the last one      
            list.remove( size - 1 );

            // sift down 
            int current = 0 ;
            while( current < size - 1)
            {
                int leftchild = 2*current + 1 ;
                int rightchild = 2*current + 2 ;


                if( leftchild >= size -1 ) break ;  // already heap 

                int maxIndex = leftchild ; 

                if( rightchild < size - 1)
                    if( list.get(maxIndex).compareTo( list.get(rightchild)) < 0)
                        maxIndex = rightchild;


                if( list.get(current).compareTo( list.get(maxIndex)) < 0 )
                {
                    // we need to switch 
                    E tmp = list.get(maxIndex);
                    list.set( maxIndex, list.get(current) );
                    list.set( current , tmp ) ;
                }
                else 
                    break;

                current = maxIndex ;
            }
            return e; 
        }
    }

    public void print()
    {
        for(E item : list )
            System.out.print( "  " + item );
        System.out.println();
    }

}
