
import java.util.Scanner;
public class Question7 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = sc.nextInt();

        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
    }
}
