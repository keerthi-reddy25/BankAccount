import java.util.*;
public class ExampleLinkedList
{
  public static void main(String [] args)
  {
    List l=new LinkedList();
    l.add("Java");
    l.add(10);
    l.add(35.5);
    l.add(23);
    l.add(null);
    System.out.println("The list:"+l);
    for(Object i :l)
    {
       System.out.println(i);
    }
    System.out.println(l.get(0));
    System.out.println(l.isEmpty());
    System.out.println("-------------");
    LinkedList ll=new LinkedList();
    ll.add("Java");
    ll.add(10);
    ll.add(20);
    ll.add("Python");
    ll.add(null);
    System.out.println("The Linkedlist:"+ll);
    for(Object i :ll)
    {
       System.out.println(i);
    }

 }
}