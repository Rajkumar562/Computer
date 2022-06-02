import java .util.*;
public class check2
{
      public static void main()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter String ");
          String s = sc .nextLine();
           int p = 0;
           
           for (int i=0;i<s.length()-1;i++)
           {
               char ch = s.charAt(i);
               char bh = s.charAt(i+1);
               if (ch == bh)
               {
                   p= p+1;
                }
                System.out.println(p);
        }
    }
}