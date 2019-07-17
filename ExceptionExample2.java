import java.util.*; 
public class ExceptionExample2
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        int d[]={1,2,3};
        try
        {
          try
          {
           c=a/b;
          }
           catch(ArithmeticException e)
           { 
            System.out.println("divide cannot be possible by zero");
           }
           System.out.println(d[20]);
        }
          catch(ArrayIndexOutOfBoundsException e)
          {
              System.out.println("errorrrrrr!!!!");
          }
          finally
          {
             System.out.println("Ho gya bahut Exception!!!!!");
          }
    }
}