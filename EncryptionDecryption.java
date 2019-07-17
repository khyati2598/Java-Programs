import java.util.*;
public class EncryptionDecryption
{
    public static void main(String args[])
    {
        char msg[]=100;
        int i,x;
        System.out.println("Please enter your message and press enter :- ");
        Scanner sc=new Scanner(System.in);
        msg = sc.nextLine();
        System.out.println("Please enter your choice :- ");
        System.out.println("Press 1 for Encrypt the string.");
        System.out.println("Press 2 for Decrypt the string.");
        Scanner Ch = new Scanner(System.in);
        x = ch.nextInt();
        
        switch(x)
        {
            case 1:
                for(i=0;(i< 100 && msg[i]!='\0');i++)
                msg[i] = (int)msg[i]+3;
                System.out.println("Encrypted String :- "+msg);
                break;
           case 2:
                for(i=0;(i< 100 && msg[i]!='\0');i++)
                msg[i] = (int)msg[i]-3;
                System.out.println("Decrypted String :- "+msg);
                break;
            default:
            System.out.println("!!!!!Error!!!!!");    
        }
    }
}