public class ConstructorTest {
    public static void main( String[] args )
    {
        //System.out.println("Hello world"); 
        //Parent p = new Parent();
        Child c = new Child();
    }
}

class Parent {

    public Parent( int n )
    {
        System.out.println("I'm a parent" + n); 
    }
}

class Child extends Parent
{
    public Child()
    {
        super(10);
        System.out.println("I'm a child"); 
    }
}
