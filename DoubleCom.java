
import java.lang.Double;
import java.util.Scanner;

public class DoubleCom{
   public static void main(String[] args)
   {
	   double d1,d2,sub;
	   System.out.println("Enter number 1:");
	      Scanner sc = new Scanner(System.in);
	      d1 = sc.nextDouble();
	      
	      System.out.println("Enter number 1:");
	      Scanner s = new Scanner(System.in);
	      d2 = s.nextDouble();
	      
	      sub=d1-d2;
	     // if (Double.compare(d1, d2) >= 0)
       if (d1 > 0 && d1 < 1)  {

           System.out.println(sub);
       }
       else if (d2 > 0 && d2 < 1) {

           System.out.println(sub);
       }
       else {

           System.out.println("False");
       }
   }
}

