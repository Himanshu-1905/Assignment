
/*
 Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it.
 */
public class StringEx {
    public static void main(String[] args) {
        String str = "Welcome to Java World";

        char fifthChar = str.charAt(4);
        System.out.println(fifthChar);

        boolean isEqual = str.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println(isEqual);

        String newStr = str.concat(" - Let us learn");
        System.out.println(newStr);

        int firstIndex = str.indexOf('a');
        System.out.println(firstIndex);

        String replacedStr = str.replace('a', 'e');
        System.out.println(replacedStr);

        String subStr = str.substring(3, 10);
        System.out.println(subStr);

        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr);
    }
}
