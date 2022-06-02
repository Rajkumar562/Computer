import java.util.*;
public class output
{
      public static void main()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a String");
          String s = sc.nextLine();
          String sLower = s.toLowerCase();
          String newstr =" ";
          for ( int i=0;i <sLower.length();i++)
          {
              char c = sLower.charAt(i);
              switch (c)
              {
                  case'a':
                  case'A':
                  case'e':
                  case'E':
                  case'i':
                  case'I':
                  case'o':
                  case'O':
                  case'u':
                  case'U':
                  newstr=newstr +(char)(c+1);
                  break;
                  default:
                  newstr = newstr+c;
                }
            }
            System.out.println("New string is:"+ newstr);
        }
    }
    