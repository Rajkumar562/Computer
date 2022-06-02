public class series
{
    public static void main(int n)
    {
        double sum=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                double a=0;
                a=a+j;
                sum=sum+(1/a);
            }
        }
        System.out.println(sum);
    }
}