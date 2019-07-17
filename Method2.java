import java.util.*;
public class Method2
{
    static void login(String Email, String password )
    {
        if(Email.equals("abc@gmail.com")&& password.equals ("123"))
        {
            System.out.println("login Sucessfully");
        }
        else
        {
            System.out.println("Unsucessfully!! try again");
        }
    }
    public static void main(String args[])
    { 
        String a,b;
        Scanner input = new Scanner(System.in);
        a = input.nextLine();
        b = input.nextLine();
        login(a,b);
    }
}