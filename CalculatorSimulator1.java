
public class CalculatorSimulator1 {
    public static void main(String[] args) {
        try {
            TaxCalculator tc = new TaxCalculator();
            double taxAmount = tc.calculateTax("Ron", false, 34000.0);
            System.out.println("Tax amount is " + taxAmount);
        } catch(Exception e){
            e.printStackTrace();
        }
        try {
            TaxCalculator tc = new TaxCalculator();
            double taxAmount = tc.calculateTax("Tim", true, 1000.0);
            System.out.println("Tax amount is " + taxAmount);
        } catch(Exception e){
            e.printStackTrace();
        }try {
            TaxCalculator tc = new TaxCalculator();
            double taxAmount = tc.calculateTax("Jack", true, 55000.0);
            System.out.println("Tax amount is " + taxAmount);
        } catch(Exception e){
            e.printStackTrace();
        }try {
            TaxCalculator tc = new TaxCalculator();
            double taxAmount = tc.calculateTax("", true, 34000.0);
            System.out.println("Tax amount is " + taxAmount);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

