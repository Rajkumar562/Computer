import java.util.*;
public class darray
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter");
        int a[][]=new int [3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int k=-1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            k++;
            System.out.print(a[k][k]);
            System.out.println();
        }
    }
}