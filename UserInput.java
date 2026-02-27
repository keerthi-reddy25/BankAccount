import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int fnum = sc.nextInt();

        System.out.print("Enter second number: ");
        int fnum1 = sc.nextInt();

        int sum = fnum + fnum1;

        System.out.println("Sum is: " + sum);

        sc.close();
    }
}