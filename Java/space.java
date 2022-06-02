import java.util.*;
public class space
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String a=sc.next();
        char ch=0;int x=0;int y=0;
        int z=a.length();
        for(int i=0;i<z;i++)
        {
            ch=a.charAt(i);
            if(ch==' ')
            {
                x++;
            }
            if(!(ch==' '))
            {
                y=y+(x/2);
                x=0;
            }
            if(i==(z-1))
            {
                y=y+(x/2);
            }
        }
        System.out.println(y);
    }
}