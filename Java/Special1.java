public class Special1
{
    public static void main(int n)
    {
        int num=n;
        int f,sum=0;
        while(n>0)
        {
            int fact=1;
            f=n%10;
            for(int i=1;i<=f;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==num)
        System.out.print("Special Number");
        else
        System.out.print("Not a Special Number");
    }
}