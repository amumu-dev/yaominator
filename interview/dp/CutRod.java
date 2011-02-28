public class CutRod{

    public static void main( String[] args )
    {
    
        int[] p = {0,1,5,8,9,10,17,17,20,25,30};
        int[] r = new int[11]; // start from 0 , but we will use from 1-10
        int[] s = new int[11]; // start from 0 , but we will use from 1-10
        
        int n = 10 ;
        System.out.println("Max value is : bottom up " + dp_bottom_up(p,r,s,n));
        for( int i = 0 ; i<= n  ; i++)
        {
            System.out.printf("%2d " , r[i] );
        }
        System.out.println();

        for( int i = 0 ; i<= n  ; i++)
        {
            System.out.printf("%2d " , s[i] );
        }
        System.out.println();
        
        //System.out.println("Max value is : top down" + dp_top_down(p,r,n));
    }

    public static int dp_bottom_up(int[] p , int[] r , int s[], int n)
    {
    
        if( r[n] > 0 ) return r[n];
        
        //int max = p[n];
        for( int j = 1 ; j<= n ; j++)
        {
            // max , r[j]+r[n-j]
            int max = p[j];
            for( int i = 1 ; i<= j ; i++)
            {
                if( r[i] + r[j-i] > max )
                {
                    max = r[i] + r[j-i];
                    s[j] = i;
                }

            }
            r[j] = max ;
        }
        //r[n] = max ;
        return r[n];
    }

    public static int dp_top_down( int[] p , int[] r , int n) 
    {
         
        return 1;
    }

}
