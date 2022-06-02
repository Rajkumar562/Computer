import java.util.*;
public class Special
{
    int n,sum;
    public Special()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        n=sc.nextInt();
    }
    public void isSpecial()
    {
        int a=n;
        int f=0;
        while(a>0)
        {
            int fact=1;
            f=a%10;
            for(int i=1;i<=f;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            a=a/10;
        }
    }
    void display()
    {
        if(sum==n)
        System.out.println("The Number is a Special Number");
        else
        System.out.println("The Number is not a Special Number");
    }
    public static void main()
    {
        Special s=new Special();
        s.isSpecial();
        s.display();
    }
}