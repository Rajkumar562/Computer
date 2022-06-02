import java .util.*;
public class check
{
     public static void main()
     {
         String a="";
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a word ");
         String s=sc.next();
         
         for (int i=s.length()-1;i>=0;i--)
         {
             a=a +(s.charAt(i));
            }
            System.out.println(a);
            if (s.equals(a))
            {
                System.out.println("It is a palindrome word");
            }
            else
            {
                System.out.println("It is not a palindrome word");
            }
        
    }
}