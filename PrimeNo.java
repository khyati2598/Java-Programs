import java.util.Scanner;
public class PrimeNo
{
    public static void main(String args[])
    {
        int n, i = 2;
        boolean b = false;
        Scanner input = new Scanner (System.in);
        n = input.nextInt();
        while(i<=n/2) 
        {
            if(n%i==0)
             {
                b = true;
                break;

             }
             i++;
        }
       if(!b)
          System.out.println(n+"is a prime number");
         else 
           System.out.println(n+"is not a prime number"); 
    }
}