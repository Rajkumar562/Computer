public class triangle
{
public static void main(int n)
{
int a=0;
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{a=a+1;
System.out.print(a);
}
System.out.println();
}
}
}
