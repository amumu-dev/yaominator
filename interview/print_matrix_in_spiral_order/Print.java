/*
 * 1  2  3  4 
 * 12 13 14 5
 * 11 16 15 6
 * 10 9  8  7
 *
 *
 * 1 2 3
 * 8 9 4
 * 7 6 5
 */


public class Print {

    public static void main( String args[]){
        int col = MAX , row = MAX ; 
        //int row = MAX ; 
        int[][] matrix = new int[col][row]; 

        try{
            assert 1==0 : " 1 is not equal to 0" ; 
        }
        catch( Exception e )
        {
            System.out.println(e); 
        }
        Spiral( matrix );

        for( int i = 0 ; i < MAX ; i++ , System.out.println())
        {
            for( int j = 0 ; j< MAX ; j++)
                System.out.printf( "%5d" , matrix[i][j]);
        }
    
        System.out.println();
    }


    final static int MAX = 10 ;

/*
    public static void testArray( int[] array )
    {
        int[] a = new int[array.length];
        for( int i = 0 ; i < a.length ; i++)
            array[i] = i ;
        array = a;
    }

*/
    public static void Spiral( int[][] m)
    {
    
        for( int i = 0 ; i< MAX ; i++ ) 
            for( int j = 0 ; j< MAX ; j++) 
                m[i][j] = i*j;
    }
/*
    public static void Spiral( int[][] matrix , int number , int start , int len )
    {

        int end = start + len ;

        for( int i = start ; i< end ; i++ )
        {
            //matrix  
        }
    
    }
*/
}
