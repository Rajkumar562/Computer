import java.util.*;
public class Encrypt
{
    String Mes="";String EnMes="";
    void readMessage()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Sentence");
        Mes=sc.nextLine();
    }
    String Rot13(String s)
    {
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ch1=(int)ch;
            if(78<=ch1 && ch1<=90)
            ch1=ch1-13;
            else if(110<=ch1 && ch1<=122)
            ch1=ch1-13;
            else
            ch1=ch1+13;
            char ch2=(char)ch1;
            if(ch==' ')
            ch2=' ';
            a=a+ch2;
        }
        return a;
    }
    void Encrypt()
    {
        EnMes=Rot13(Mes);
    }
    void display()
    {   
        System.out.println("The Encryption of the Sentence is:");
        System.out.println(EnMes);
    }
    public static void main()
    {
        Encrypt en=new Encrypt();
        en.readMessage();
        en.Encrypt();
        en.display();
    }
}