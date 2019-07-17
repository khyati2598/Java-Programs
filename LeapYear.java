import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if((a%4==0))
        {
           if((a%100)==0)
           {
              if((a%400)==0)
              {
                  System.out.println("Leap year");
              }
              else
              {
                 System.out.println(" leap year");
              }  
             }
              else 
             {
                   System.out.println("Not a Leap year");
              }
        }
        else 
         {
              System.out.println("Not a Leap year");
         }
    }
}