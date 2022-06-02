import java.util.*;
public class nCr
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter r");
        int r=sc.nextInt();
        int s=n-r;
        int a=1;int b=1;int c=1;
        for(int i=1;i<=n;i++)
        {
            a=a*i;
        }
        for(int i=1;i<=r;i++)
        {
            b=b*i;
        }
        for(int i=1;i<=s;i++)
        {
            c=c*i;
        }
        int ans=(a/(b*c));
        System.out.println(ans);
    }
}