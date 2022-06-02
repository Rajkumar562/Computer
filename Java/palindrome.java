public class palindrome
{
     public static void main(int n)
     {
         int r,a=0,num=n;
         while(n>0)
         {
             r=n%10;
             a=(a*10)+r;
             n=n/10;
            }
         if(num==a)
         System.out.println("Palindrome Number");
         else
         System.out.println("Not a Palindrome Number");
        }
    }