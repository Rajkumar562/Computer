public class Compare
{
    public static void main(int a,int b,int c)
    {
        int x=0;
        int y=0;
        if(a==b)
        {
            if(a<c)
            {x=a;
            y=c;
            a=y;
            c=x;}
        }
        if(a==c)
        {if(a<b)
            {x=a;
                y=b;
                a=y;
                b=x;
            }
        }
        if(a<b)
        {
            x=a;
            y=b;
            a=y;
            b=x;
        }
        if(a<c)
        {
            x=a;
            y=c;
            a=y;
            c=x;
        }
        if(b<c)
        {
            x=b;
            y=c;
            b=y;
            c=x;
        }
        System.out.println("Descending Order is "+a+" "+b+" "+c);
    }
}