import java.util.*;
public class kcah
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int x=0;
        for(char a='?';a<='?';a++)
        {
            for(int i=1;i<=15;i++)
            {
                for(int j=2;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=1;k++)
                {
                    x++;
                    System.out.print(x);
                }
                System.out.println();
            }
        }
    }
}