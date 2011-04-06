public class Combination {

    public static void main( String[] args )
    {
    
        /*
        for( String s : args )
            System.out.println(s);
        */

        int[] comb = { 2 ,3 ,6 , 7 };
        //int[] comb = { 2 , 2 , 3 , 4 , 4 , 3 , 4 , 7 };

        int sum = 7 ;

        int i  = 0;

        int j = i & ( i-1);
        System.out.println("number is " + j);
        
        //printCombination( int[] comb , int sum );
        //
        //


        Node fast ;
        Node slow ; 

        slow = head ;

        fast = head.next ;

        while( fast != null && fast.next != null)


    }

    public static void printCombination( int[] comb , int sum)
    {
    
    }


}
