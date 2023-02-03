import java.util.Scanner;

public class Question6 {

    public static void main(String[] Strings) {


        int minutesInYear = 60 * 24 * 365;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the number of minutes: ");

        int min = sc.nextInt();

        int years = (min / minutesInYear);
        
        int days = (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
