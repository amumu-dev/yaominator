public class FindMaxContinuousArray{

    public static void main( String[] args )
    {

        int[] input = { 1 , -3 , 5 , -2 , 9 , -8 , -6 ,4 };

        int maxsofar = 0 ;
        int maxendinghere = 0 ;

        for( int i = 0 ; i< input.length ; i++)
        {
            maxendinghere = maxendinghere + input[i] > 0 ? maxendinghere + input[i] : 0 ;
            maxsofar = maxsofar > maxendinghere ? maxsofar : maxendinghere ;
        }

        System.out.println( " max is " + maxsofar );
    }


}

