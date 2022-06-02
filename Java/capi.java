import java.util.*;
public class capi
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter");
        String a=sc.nextLine();
        String y="";
        int x=a.length();char ch=0;
        for(int i=0;i<x;i++)
        {
            ch=a.charAt(i);
            if(i==0)
            y+=Character.toUpperCase(ch);
            else if((ch==' ')&& (i<x-1))
            y+=Character.toUpperCase(a.charAt(i+1));
            else
            y+=ch;
        }
        System.out.println(y);
    }
}
            