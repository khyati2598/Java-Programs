import java.util.Scanner;
public class Cgpa
{
    public static void main(String args[])
    {
        int s1,s2,s3,s4,s5,Cgpa;
        System.out.println("Enter marks :- ");
        Scanner input = new Scanner(System.in);
        s1=input.nextInt();
        s2=input.nextInt();
        s3=input.nextInt();
        s4=input.nextInt();
        s5=input.nextInt();
        Cgpa=(s1+s2+s3+s4+s5)/5;
        System.out.println("Percentage from cgpa is "+Cgpa*9.5);
    }
}