import java.util.*;
public class Quad
{
    double a,b,c,d,x1,x2=0;
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b,c");
        double m1=sc.nextDouble();
        double m2=sc.nextDouble();
        double m3=sc.nextDouble();
        Quad q=new Quad();
        q.quad(m1,m2,m3);
        q.r4();
    }
    void quad(double q1,double q2,double q3)
    {
        a=q1;
        b=q2;
        c=q3;
    }
    void dis()
    {
        d=(b*b)-(4*a*c);
        if(d>0)
        r1();
        else if(d==0)
        r2();
        else if(d<0)
        r3();
    }
    void r1()
    {
        double x3,x4=0;
        x3=(-b)+(Math.sqrt(d));
        x4=(-b)-(Math.sqrt(d));
        x1=x3/(2*a);
        x2=x4/(2*a);
        System.out.println("Roots are real and unequal: x = "+x1+", "+x2);
    }
    void r2()
    {
        x1=(-b/2*a);
        x2=x1;
        System.out.println("Roots are real and equal: x = "+x1+", "+x2);
    }
    void r3()
    {
        System.out.println("Roots are imaginary");
    }
    void r4()
    {
        if(a==0)
        System.out.println("Equation does not exist");
        else
        dis();
    }
}