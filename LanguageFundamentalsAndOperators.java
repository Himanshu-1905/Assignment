
class TaxCalculator {
    float basicSalary;
    boolean citizenship;
    float tax;

    public TaxCalculator(float basicSalary, boolean citizenship) {
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;
    }

    public void calculateTax() {
        float tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
        this.tax = tax;
    }

    public void deductTax() {
        int netSalary = (int) (basicSalary - tax);
        System.out.println("The net salary of the employee " + netSalary);
    }

    public void validateSalary() {
        boolean response = basicSalary > 100000 && citizenship;
        System.out.println("The salary and citizenship eligibility: " + response);
    }
}

public class LanguageFundamentalsAndOperators {
    public static void main(String[] args) {
        TaxCalculator taxCalc = new TaxCalculator(25000, true);
        taxCalc.calculateTax();
        taxCalc.deductTax();
        taxCalc.validateSalary();

        taxCalc = new TaxCalculator(125000, true);
        taxCalc.calculateTax();
        taxCalc.deductTax();
        taxCalc.validateSalary();
    }
}
