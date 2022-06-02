public class series5
{
    public static void main()
    {
        int n=0,a=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i;k++)
            {
                n=n+1;
                System.out.print(" "+n);
            }
            a=n;
            for(int l=2;l<=i;l++)
            {
                a=a-1;
                System.out.print(" "+a);
            }
            System.out.println();
        }
    }
}