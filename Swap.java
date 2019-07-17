public class Swap
{
    public static void main(String args[])
    {
        int a=10,b=20;
        System.out.println("Without Swapping value of a is "+a);
        System.out.println("Without Swapping value of b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swapping is "+a); 
        System.out.println("Numbers after swapping is "+b); 
    }
}