public class LCM
{
    public static void main(int a,int b)
    {
        for(int i=1;;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println("LCM is "+i);
                break;
            }
        }
    }
}
            