public class fact2
{
   public static void main(double x,int n)
   {
       double sum=0;
       for(double i=5;i<=n;i+=3)
       {
           sum=sum+(x/i);
        }
        System.out.println(sum);
    }
}