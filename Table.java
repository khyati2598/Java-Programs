import java.util.Scanner;
public class Table
{
    public static void main(String args[])
    {
        int a,b,i=1;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        while(i<=10)
        {
            b=a*i;
            System.out.println(+b);
            i++;
        }
    }
}