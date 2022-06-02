import java.util.*;
public class Transarray
{
    static Scanner sc=new Scanner(System.in);
    int a[][],m,n;
    Transarray()
    {
        m=0;
        n=0;
    }
    Transarray(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int [m][n];
    }
    void fillarray()
    {
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void transpose(Transarray A)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=A.a[j][i];
            }
        }
    }
    void display()
    {
        System.out.println("Transpose of the array is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        System.out.println("Enter the 2D array size");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        Transarray tr1=new Transarray(m1,n1);
        Transarray tr2=new Transarray(n1,m1);
        tr1.fillarray();
        tr2.transpose(tr1);
        tr2.display();
    }
}