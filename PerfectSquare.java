import java.util.Scanner;
public class PerfectSquare
{
    public static void main(String args[])
    {
        int n,r,s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r=(int)Math.sqrt(n);
        s=r*r;
        if(s==n)
        System.out.println("Perfect Square");
        else 
        System.out.println("Not a Perfect Square");
    }
}