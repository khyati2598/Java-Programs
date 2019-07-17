import java.util.*;
public class PasswordVerification
{
    public static void main(String args[])
    {
        String specialCharacters = "~!@#$%^&*()_=-+}'\"<,>.?/";
        String pass;
        boolean Valid = false;
        boolean numberPresent =false;
        boolean lowerCasePresent = false;
        boolean upperCasePresent = false;
        boolean specialCharacterPresent = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Password :- ");
        pass = sc.nextLine();
        if(pass.length()<8);
        {
            Valid = false;
            System.out.println("Password must have atleast 8 character!!");
        }
        for(int i=0;i<=pass.length();++i)
        {
            char c = pass.charAt(i);
            if(c.isDigit(i)){
                numberPresent = true;
            }else if(c.isupperCase(i)){
                upperCasePresent = true;
            }else if(c.islowerCase(i)){
                lowerCasePresent = true;
            }else if(specialCharacter.contains(String.valueOf(i))){
                specialCharacterPresent = true;
            }
        }
        return ( numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent);
    }
}