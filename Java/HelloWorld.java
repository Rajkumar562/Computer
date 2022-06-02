import java.util.*;
public class HelloWorld{

    public static void main(String []args){
       HelloWorld h =new HelloWorld();
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter");
       String qwer=sc.next();
       String t=h.isValid(qwer);
       System.out.println(t);
    }
    public static String isValid(String s) {
       String r="";
       int a[]=new int [26];
       for(int i=0;i<s.length();i++)
       {
           int c=(int)s.charAt(i);
           a[c-97]++;
       }
       int max=0;int min=10;
       for(int i=0;i<26;i++)
       {
           if(a[i]>max)
           max=a[i];
           if(a[i]<min && a[i]!=0)
           min=a[i];
       }
       if(max-min==0)
       r="YES";
       else
       {
           int x=0;int y=0;int z=0;
           for(int i=0;i<26;i++)
           {
               if(a[i]==max)
               x++;
               else if(a[i]==min)
               y++;
               else if(a[i]!=0)
               z++;
           }
           if(z==0)
           {
               if(min==1 && y==1)
               r="YES";
               else if(x==1 && max-min==1)
               r="YES";
               else
               r="NO";
           }
           else
           r="NO";
       }
       return r;
   }
}