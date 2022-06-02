public class fact1
{
    public static void main(int n)
    {
        double sum=0;
        for(double i=4;i<=4*n;i+=4)
        {
            sum = sum+(1/i);
        }
        System.out.println(sum);
    }
}