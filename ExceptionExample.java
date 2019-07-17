import java.util.*; 
public class ExceptionExample
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        try
        {
           c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("divide cannot be possible by zero");
        }
    }
}