import java.util.*;
class inherit
{
    String name;
    int pan,acc;
    double pay;
    inherit(String n,int p,int a,double s)
    {
        name=n;
        pan=p;
        acc=a;
        pay=s;
    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("PAN no:"+pan);
        System.out.println("Salary:"+pay);
        System.out.println("Account No:"+acc);
    }
}
public class retire extends inherit
{
    int yr;
    double pf,gr;
    retire(String n,int p,int a,double s,int y)
    {
        super(n,p,a,s);
        yr=y;
    }
    void prov()
    {
        pf=0.02*pay*yr;
    }
    void gra()
    {
        if(yr>=10)
        gr=12*pay;
        else
        gr=0;
    }
    void display()
    {
        super.display();
        System.out.println("Provident Fund:"+pf);
        System.out.println("Gratuity Amount:"+gr);
    }
}