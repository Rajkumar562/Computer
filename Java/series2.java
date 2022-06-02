public class series2
{
    public static void main(int n)
    {
        char a='?';
        char b='$';
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("?");
            }
            System.out.println("$");
        }
    }
}