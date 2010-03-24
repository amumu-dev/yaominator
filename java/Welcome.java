public class Welcome
{

    public static void main( String[] args)
    {
        Calculator cal;
        cal = new Calculator(10 , 10);
        int number = cal.getNumber();  
        System.out.println("Number is " + number );
        cal = new Calculator(10.12 , 10.34);
        double d = cal.getNumber();  
        System.out.println("Number is " + d);
    }
}

class Calculator {
    private int number =0 ;

    public Calculator( int n , int m )
    {
        number = n*m ; 
    }

    public Calculator( double n , double m )
    {
        number = n*m ; 
    }


    public int getNumber()
    {
        return number; 
    }
}
