import java.util.Scanner;
public class Calculator
{
   public static void main(String args[])
   {
       int a,b,c;
       int op;
       System.out.println("enter two values");
       
       System.out.println("press 1 for add");
       System.out.println("press 2 for sub");
       System.out.println("press 3 for mul");
       System.out.println("press 4 for div");
       
       Scanner input = new Scanner(System.in);
       a = input.nextInt();
       b = input.nextInt();
       op = input.nextInt();
       
       switch (op)
       {
       case 1:
           c = a+b;
           System.out.println("Addition of two no is "+c);
           break;
       case 2:
           c = a-b;
           System.out.println("Subtraction of two is "+c);
           break;
       case 3:
           c = a*b;
           System.out.println("Multiply of two no is"+c);
           break;
       case 4:
           c = a/b;
           System.out.println("Division of two no is"+c);
           break;
    }
}
}