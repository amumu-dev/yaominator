import java.util.*;

public class StringReplace {


    public static void main( String[] args )
    {

        StringBuilder sb = replace( "aa" , "aaa" );
        assert "aa".equals(sb.toString()) : sb + " equal to aa";

        //System.out.println(sb);
    }

    

    public static StringBuilder replace( String s , String patten )
    {
        char replacement = 'X';
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while( i< s.length() )
        {

            boolean isEqual = false ;

            for( int j = 0 ; j < patten.length() && i+j < s.length() ; j++ )
            {
                if( s.charAt(i+j) != patten.charAt(j))
                {
                    isEqual = false;
                    break;
                }
                if( j == patten.length() - 1)
                    isEqual = true;

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
        //System.out.println( sb);
        return sb;
    }

}
