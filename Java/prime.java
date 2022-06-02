public class prime
{
    public static void main()
    {
        int a=0;
        for(int i=1;i<=30;i++)
        {
            int flag=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                flag=flag+1;
            }
            if(flag==2)
            {
                a=a+1;
                for(int k=a;k<=a;k++)
                {
                    for(int l=1;l<=k;l++)
                    {
                        System.out.print(i);}
                   }
                    System.out.println(); 
            }
        }
    }
}
