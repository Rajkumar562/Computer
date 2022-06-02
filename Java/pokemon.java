import java.util.ArrayList;
public class pokemon
{
    public static void main()
    {
        ArrayList<String> po=new ArrayList();
        po.add("Slakoth");
        po.add("Rhyperior");
        po.add("Mewtwo");
        System.out.println(po);
        String temp[]=new String[po.size()];
        po.toArray(temp);
        for(String t:temp)
        {
            System.out.println(t);
        }
        System.out.println(po);
    }
}