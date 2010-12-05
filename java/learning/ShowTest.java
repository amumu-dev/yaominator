import com.yahoo.tv.* ;

public class ShowTest 
{

    public static void main( String[] args)
    {
        Show show = new Show(1 , "How I met your mother");

        System.out.println("Show ID is " + show.getID());
        System.out.println("Show name is " + show.getName());
    }
}

