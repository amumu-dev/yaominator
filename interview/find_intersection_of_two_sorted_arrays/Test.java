import java.util.*;

public class Test {

    public static void main( String args[])
    {

        int[] A = { 1 , 3 , 5 , 8 , 9 , 10 };
        int[] B = { 1 , 2 , 3 , 4 , 5, 6, 7 , 8 , 1000};

        for(  Integer i : findIntersection( A , B )) {
            System.out.print( " " + i ); 
        } 

        System.out.println() ;
    }

    public static ArrayList<Integer> findIntersection( int[] A , int[] B)
    {
    
        ArrayList<Integer> al = new ArrayList<Integer>();

        int i = 0 ;
        int j = 0 ;

        //System.out.println("size is " + A.length);


        while( i < A.length  && j < B.length  )
        {
            
            if( A[i] == B[j])
            {
                al.add(A[i]);
                i++ ;
                j++ ;
            }
            else if ( A[i] > B[j])
                    j++;
            else
                    i++;
        }

        return al;
    }
}
