import java.util.*;
public class reverse
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String a=sc.next();
        StringBuffer s1=new StringBuffer(a);
        s1.reverse();
        System.out.println(s1);
    }
}