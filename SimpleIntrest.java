import java.util.Scanner;
public class SimpleIntrest
{
    public static void main(String args[])
    {
        int si,p,r,t;
        System.out.println("Enter Principal ,Rate and time");
        Scanner input = new Scanner(System.in);
        p=input.nextInt();
        r=input.nextInt();
        t=input.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple Intrest is : "+si);
    }
}