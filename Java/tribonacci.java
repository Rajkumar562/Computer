public class tribonacci
{
    public static void main(int n)
    {
        int f=0;
        int l=1,m=2;
        System.out.print(" "+f);
        System.out.print(" "+l);
        System.out.print(" "+m);
        for(int i=1;i<=n;i++)
        {
            int c=f+l+m;
            System.out.print(" "+c);
            f=l;
            l=m;
            m=c;
        }
    }
}