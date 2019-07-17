import java.util.*;
public class Password
{
    public static void main(String args[])
    {
        String p;
        int complex = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Password:- ");
        p = input.nextLine();
        System.out.println(""+p);
        complex = check(p);
        switch(complex)
        {
            case 0: 
                     System.out.println("Weak password(less than 6 letters)");
                     break;
            case 1: 
                     System.out.println("Weak password(only lower case )");
                     break;
            case 2: 
                     System.out.println("Weak password (Only uper case )");
                     break;
            case 3: 
                     System.out.println("Medium (only digits)");
                     break;
            case 4: 
                     System.out.println("Medium (lower and upper)");
                     break;
            case 5: 
                     System.out.println("Medium (upper and digits)");
                     break;        
            case 6: 
                     System.out.println("Medium (lower and digits)");
                     break;
            case 7: 
                     System.out.println("Strong (lower, upper, digits)");
                     break;
        }
    }
    static int check(String k)
    {
      char pass[]=new char[20];
      pass=k.toCharArray();
      int i,length=0,uc=0,di=0,lc=0,sf=0;
      length = k.length();
      if(length<6)
           return 0;
      for(i=0;i<length;++i)
      {
          if(pass[i]>='a'&& pass[i]<='z')
          {
              lc = 1;
              break;
          }
      }
      for(i=0;i<length;++i)
      {
          if(pass[i]>='A'&& pass[i]<='Z')
          {
              uc = 2;
              break;
          }
      }
      for(i=0;i<length;++i)
      {
          if(pass[i]>='0'&& pass[i]<='9')
          {
              di = 3;
              break;
          }
      }
      for(i=0;i<length;++i)
      {
          if(pass[i]>='A'&& pass[i]<='Z'||pass[i]>='a'&&pass[i]<='z')
          {
              ul = 4;
              break;
          }
      }
      for(i=0;i<length;++i)
      {
          if(pass[i]>='A'&& pass[i]<='Z'||pass[i]>='0'&&pass[i]<='9')
          {
              ul = 5;
              break;
          }
      }
      for(i=0;i<length;++i)
      {
          if(pass[i]>='a'&& pass[i]<='z'||pass[i]>='0'&&pass[i]<='9')
          {
              ul = 6;
              break;
          }
      }
      for(i=0;i<length;++i)
      {
          if(pass[i]>= 32 && pass[i]<'0'||(pass[i]>'9'&& pass[i]<'A')||(pass[i]>'z' && pass[i]<'a')||(pass[i]>'z'&& pass[i]<127))
          {
              sf = 7;
              break;
          }
      }
        return  lc+uc+ul+di+sf;
    }
}