import java.util.*;
import java.io.*;
public class file
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileInputStream fin=new FileInputStream("system.dat");
        DataInputStream din=new DataInputStream(fin);
        int n=din.readInt();
        System.out.println(n);
        din.close();
        fin.close();
    }
}