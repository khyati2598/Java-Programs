public class Largest
{
    public static void main(String args[])
    {
        int a = 12,b = 1,c = 6;
        if(a>b)
        {
            if(a>c)
            {
              System.out.println("A is greater than B and C");
            }
            else 
            {
                System.out.println("C is greater than A and B");
            }
        }
        else if (b>c)
            {
            System.out.println("B is greater than A and C");
            }
           else
             System.out.println("C is greater than A and B"); 
    }
}