
import java.util.*;

public class CheckOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int n = sc.nextInt();
		System.out.println("Check whether evert digit of a given integer is even . return true if every digit is odd otherwise false?");
		System.out.println(test(n));
	}
	public static boolean test(int n) {
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			
			if (digit % 2 == 0) {
				return false;
			}
	}
		// all digits are odd
		return true;
	}
}
