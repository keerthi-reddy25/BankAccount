import java.util.Scanner;
public class Factorial{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int i=1;
long f=1;
while(i<=n)
{
f=f*i;
i++;
}
System.out.println("factorial:"+f);
}
}