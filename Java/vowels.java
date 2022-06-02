import java .util.*;
public class vowels
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one value");
        
        String s=sc.nextLine ();
        
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println("Vowels are:"+ch);
            }
        }
    }
}