2import java.util.Scanner;
class TakeInput
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("Enter no. ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = a+b;
        System.out.println("Addition is"+c);

    }
}