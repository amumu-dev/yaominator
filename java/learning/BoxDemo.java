
// define class name with <T> for type 
class Box<T extends Number > {
    private T t; // T stands for type
    public void add( T t )
    {
        this.t = t ;
    }

    public T get()
    {
        return t;
    }

    //public <U> void inspect(U u){
    public <U> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    /*
    public static <U> void fillBoxes( U u , List<Box<U>> boxes)
    {
        for( Box<U> box : boxes )
        {
            box.add(u);
        }
    }
    */

}

public class BoxDemo {
    public static void main(String[] args ) 
    {
        // define variable with actual type 
        // place <ActualType> between the class name and the parenthesis
        Box<Integer> intBox = new Box<Integer>();
        intBox.add( new Integer(10));

        //String s = new String("this is a test ");
        String s = "this is a test ";
        System.out.println(s);
        //Integer someInt = intBox.get();
        //System.out.println( "Integer is " + someInt );

        //intBox.inspect("some text");
        intBox.inspect( new Double(2.35));
    }

}
