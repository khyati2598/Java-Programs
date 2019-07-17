import java.util.Scanner;
public class Rectangle
{
    public static void main(String args[])
    {
        int area,l,b;
        Scanner input = new Scanner(System.in);
        l=input.nextInt();
        b=input.nextInt();
        area = (2*(l+b));
        System.out.println("Area of Rectangle "+area);
    }
}