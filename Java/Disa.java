import java.util.*;
public class Disa
{
    int n,nd,sum;
    public Disa()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        n=sc.nextInt();
        nd=0;
        sum=0;
    }
    public void count()
    {
        int a=n;
        for(int i=1;i<=n;i++)
        {
            if(a%10==0)
            break;
            else
            {nd++;a=a/10;}
        }
    }
    void check()
    {
        int c=0,x=n;
        for(int i=0;i<nd;i++)
        {
            c=x%10;
            sum=sum+(int)Math.pow(c,(nd-i));
            x=x/10;
        }
    }
    void display()
    {
        if(sum==n)
        System.out.println("The Number is a Disarium Number");
        else
        System.out.println("The Number is not a Disarium Number");
    }
    public static void main()
    {
        Disa d=new Disa();
        d.count();
        d.check();
        d.display();
    }
}