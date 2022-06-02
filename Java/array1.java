import java.util.*;
public class array1
{
      public static void main()
      {
          Scanner sc = new Scanner (System.in);
          System.out.println("Enter 10 values");
          int A[] = new int[10];
          for(int i=0;i<=9;i++)
          {
              A[i]=sc.nextInt();
            }
          for(int j=0;j<=9;j++)
            {
                System.out.println(A[j]);
            }
        }
    }