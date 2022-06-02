public class fact3
{
      public static void main(double x,int n)
      {
          double fact=1;
          double sum=0;
          for(double i=1;i<=n;i++)
          {
              fact=fact*i;
              sum=sum+((Math.pow(x,i))/fact);
            }
            System.out.println(sum);
        }
    }
