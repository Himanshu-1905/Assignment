/*
Problem:
You are given a piece of Java code. You have to complete the code by writing down the handlers for exceptions thrown by the code. The exceptions the code 
may throw along with the handler message are listed below:

Division by zero: Print "Invalid division".
String parsed to a numeric variable : Print "Format mismatch".
Accessing an invalid calculation : Print "calculation invalid".
Accessing an invalid index in array : Print "Array index is invalid".

after the exception is handled, print "Exception Handling Completed".
*/
public class Main {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        }

        try {
            int number = parseInt("abc");
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        }

        try {
            int[] array = {1, 2, 3};
            int value = array[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        try {
            int result = calculate(-1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Calculation invalid");
        }
        System.out.println("Exception Handling completed.");
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }

    public static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Format mismatch");
        }
    }

    public static int calculate(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Calculation invalid");
        }
        return x * 2;
    }
}
