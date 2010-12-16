//import java.util.*;

public class StringReplace {


    public static void main( String[] args )
    {

        String s = "abcdefgdfegabcabc";

    
        replace( s );
    }

    public static String replace( String s)
    {
        String patten = "abc";
        char replacement = 'X';

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while( i< s.length() )
        {

            boolean isEqual = true ;

            for( int j = 0 ; j < patten.length() && i+j < s.length() ; j++ )
            {
                if( s.charAt(i+j) != patten.charAt(j))
                {
                    isEqual = false;
                    break;
                }
            }

            if( isEqual )
            {
                if( sb.length() == 0 || ( sb.charAt( sb.length()- 1) != replacement ))
                    sb.append( replacement );
                i += patten.length() ; 
            }
            else{
                sb.append( s.charAt(i));
                i++;
            }
            
            //sb.append(c);
            //if( i % 2 == 0)
            //    sb.deleteCharAt( sb.length() - 1);
            //System.out.print( c );
        
        }

        System.out.println( sb);
        return patten;
    }

}
