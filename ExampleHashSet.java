import java.util.*;
class Doggy
{
  private String name;
  private String breed;
  public Doggy(String name,String breed)
  {
     super();
     this.name=name;
     this.breed=breed;
  }
  public String getName()
  {
    return name;
  }
  public String getBreed()
  {
     return breed;
  }
  @Override
  public String toString()
  {
     return "Doggy[name=" + name +", breed=" + breed + "]";
  }
  
}
public class ExampleHashSet
{
  public static void main(String [] args)
  { 
     Doggy d=new Doggy("Kuma","goldenretriever");
     HashSet<String> hs=new HashSet<String>();
     hs.add(d);
     for(Object e : hs)
    {
       System.out.println(e);
    }
  }
}