
import java.util.ArrayList;
import java.util.List;
public class ExampleCollection
{
   public static void main(String [] args)
   {
      List<Integer> l=new ArrayList<>();
      l.add(10);
      l.add(20);
      l.add(30);
      l.add(40);
      System.out.println("list:"+l);
      for(Object i:l)
      {
         System.out.println(i);
      }
      System.out.println(l.size());
      System.out.println(l.contains(10));
      System.out.println(l.get(1));
      System.out.println(l.getFirst());
      System.out.println("----------");
      ArrayList<Integer> al=new ArrayList<>();
      al.add(15);
      al.add(30);
      al.add(45);
      al.add(60);
      System.out.println("ArrayList :"+al);
        }
}