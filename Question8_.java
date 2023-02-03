

import java.util.Scanner;
public class Question8_ {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int a = sc.nextInt();
        //convert in integer
        String b = Integer.toString(a);
        //convert in char array
        char [] s = b.toCharArray();
        System.out.print("The individual char are: ");
        for(int i=0; i<s.length; i++) {
        	System.out.print(s[i]+" ");
        }
    }
}