import java.util.*;
public class Arrays
{
     public static void main()
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name to be searched");
      String w[]={"CHICHEN ITZA","CHRIST THE REDEEMER","TAJMAHAL","GREAT WALL OF CHINA","MACHU PICCHU","PETRA","COLOSSEUM"};
     String c[]={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
      String s=sc.nextLine();
      int i,flag=0;
      for(i=0;i<7;i++)
      {
          if(s.equalsIgnoreCase(c[i]))
          {
              flag=1;
              break;
            }
        }
        if(flag==1)
        {
            System.out.println(c[i]+"-"+w[i]);
        }
        else
        {
            System.out.println("Sorry Not Found!!!!!");
        }
    }
}