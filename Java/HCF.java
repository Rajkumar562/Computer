public class HCF
{
    public static void main(int a,int b)
    {
        int rem=1,c,d;
        if(a<b)
        {c=a;d=b;a=d;b=c;
        }
        while(rem>0)
        {
            rem=a%b;
            if(rem!=0)
            {
            a=b;
            b=rem;
        }
        else
        {break;}
        }
        System.out.println("HCF is "+b);
    }
}