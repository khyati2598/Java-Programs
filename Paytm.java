import java.util.Scanner;
public class Paytm
{
    public static void main(String args[])
    {
        int a ,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = (a*18)/100; 
        c = a+b;
        System.out.println("paytm amount is" +c);
    }
}