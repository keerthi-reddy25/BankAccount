import java.util.Scanner;
public class User{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int sum=0;
double avg=0;
System.out.println("Enter number of numbers: ");
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int j=0;j<n;j++){
sum+=arr[j];
}
avg=sum/n;
System.out.println(sum);
Systen.out.println(avg);
}
}
