
import java.util.*;
class Student1
{
  private String name;
  private int age;
  public String getName
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public int getAge
  {
    return age;
  }
  public void getAge(int age)
  {
    this.age=age;
  }
  public Student1(String name,int age)
  {
    super();
    this.name=name;
    this.age=age;
  }
  @Override
  {
    public String toString()
    {
       return "Name="+name+",Age"+age;
    }
  }
}
public class ArrayList
{
  public static void main(String [] args)
  {
    Student1 s1=new Student1("Nami",20);
    Student1 s2=new Student1("Jimbei",19);
    ArrayList al=new ArrayList();
    al.add(s1);
    al.add(s2);
    for(Object i :l)
    {
       System.out.println(i);
    }
  }
}