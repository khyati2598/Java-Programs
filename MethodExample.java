public class MethodExample
{
    static void myMethod()
    {
        System.out.println("I just got Executed");
    }
    static void addMethod(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        myMethod();
        addMethod(5,5);
    }
}