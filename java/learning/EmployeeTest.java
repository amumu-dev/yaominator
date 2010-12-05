class Employee implements Comparable
{
    private String name;
    private int salary ;

    public Employee( String n , int s )
    {
        name = n;
        salary = s; 
    }

    public int compareTo(Object otherObj)
    {
        Employee other = (Employee)  otherObj ;
        if( salary < other.salary ) return -1;
        if( salary > other.salary ) return 1;
        return 0;
    }
}

/** You can only have one public interface/class in your file
 * and you have to name it as that interface/class name.java
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        /* For string , you can only use " , but not ' */
        Employee jiqing = new Employee("haha" , 1000);
        Employee leo    = new Employee("hehe" , 2000);
        int result      = jiqing.compareTo(leo);
        switch (result) {
            case 1: 
                /* Remember to use case here */
                System.out.println("Jiqing has more");
                break;
            case -1: 
                System.out.println("Leo has more");
                break;
            case 0: 
                System.out.println("They are the same");
                break;
        }
    }

}
