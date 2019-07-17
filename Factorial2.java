import java.util.Scanner;
    public class Factorial2
    {
        public static void main(String args[])
        {
            int a,i,f=1;
            System.out.println("enter no for finding factorial");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            for(i=1;i<=a;i++)
            {
                f=f*i;
            }
            System.out.println("Factorial is "+f);
            //using While loop
            while(i<=a)
            {
                f=f*i;
                i++;
            }
            System.out.println("using While loop");
            System.out.println("Factorial is "+f);       
        }
    }