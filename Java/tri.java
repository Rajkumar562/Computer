import java.io.*;
public class tri
{
        public static void main()
        {
             DataInputStream in = new DataInputStream (System.in);
             int n = 0;
             try
             {
                 System.out.println("Enter a digit");
                 n = in.readInt();
                }
                catch(Exception e){}
                if (n %2==0)
                System.out.println("You entered an even number");
                else
                System.out.println("You entered an odd number");
            }
        }
        
                