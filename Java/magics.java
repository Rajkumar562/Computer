public class magics
{
    public static void main(long n)
    {
        long la,lb,sum=0,s=0;
        while(n>0)
        {
            la=n%10;
            sum=sum+la;
            n=n/10;
        }
        while(sum>0)
        {
            lb=sum%10;
            s=s+lb;
            sum=sum/10;
        }
        if(s==1)
        System.out.print("Magic Number");
        else
        System.out.print("Not a Magic Number");
    }
}