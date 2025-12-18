import java.util.Scanner;
class Addition implements Runnable
{
  public void run()
  {
     System.out.println("Addition task started");
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the first number:");
     int a=s.nextInt();
     System.out.println("Enter the second number:");
     int b=s.nextInt();
     int sum=a+b; 
     System.out.println(sum);
     System.out.println("Addition task completed");
  }
}
class Character implements Runnable
{
  public void run()
  {
     System.out.println("character printing started");
     for(int i=65;i<=75;i++)
     {
        System.out.println((char)i);
        try
        {
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
     }
     System.out.println("character printing  task  is completed");

  }
}
class Number implements Runnable
{
  public void run()
  {
     System.out.println("number printing started");
     for(int i=1;i<=10;i++)
     {
        System.out.println(i);
        try
        {
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
     }
     System.out.println("number printing  task  is completed");
   }
}
public class MultiRunnable
{
   public static void main(String [] args)
   {
     Addition a=new Addition();
     Character c=new Character();
     Number n=new Number();
     Thread t1=new Thread(a);
     Thread t2=new Thread(c);
     Thread t3=new Thread(n);
     t1.start();
     t2.start();
     t3.start();
  }
}
