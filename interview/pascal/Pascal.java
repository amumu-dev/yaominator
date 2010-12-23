public class Pascal{

    public static void main( String[] args )
    {
        int  n = 25;


        for( int j = 1 ; j <= n ; j++)
        {
            int[] p = mypascal(j);
            for( int i : p)
                System.out.print("  " + i);
            System.out.println();
        }

        System.out.println();
        
    }

    public static int[] mypascal( int n )
    {

        if( n == 1 )
            return new int[]{1};
    
        if( n == 2)
            return new int[]{1,1};

        int[] prev = mypascal(n-1);

        int[] current = new int[n];

        current[0] = 1 ;
        current[n-1] = 1;

        for( int i = 1 ; i < n-1 ; i++)
            current[i] = prev[i-1] + prev[i] ;  
            
        return current ;

    }
}
