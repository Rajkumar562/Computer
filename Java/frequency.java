import java .util.*;
public class frequency 
{
        public static void main()
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter String ");
            String s =sc .nextLine ();
            int p =0;
            for (int i = 0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if (ch =='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u')
                {
                    p = p+1;
                }
            }
            System.out.println("There are"+p+"vowels");
        }
    }