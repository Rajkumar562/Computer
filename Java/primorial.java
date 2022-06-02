public class primorial
{
    public static void main(int n)
    {
        int f,p=1;
        for(int i=1;i<=n;i++)
        {
            f=0;
            for(int j=1;j<=i;j++)
            {
              if(i%j==0)
              {
                f++;
               }
            }
            if(f==2)
            {
                p=p*i;
            }
        }
        System.out.println("Primorial is "+p);
    }
}