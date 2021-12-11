package kidkoder;
class variables {
    static double beforeTax = 0;
    static double afterTax = 0;
    static double BeforeTax = 0;
    static double AfterTax = 0;
}
public class test extends variables{
    public static void main(String[] args) {
        beforeTax = 1.00 + 2.65 + 1.50 + 3.30 + 1.50;
        System.out.println("Before Tax:" + " " + "$" + String.format("%.2f", beforeTax));
        afterTax = 1.0875 * beforeTax;
        System.out.println("After Tax:" + " " + "$" + String.format("%.2f", afterTax));
        System.out.println();
        BeforeTax = 5.00 + 5.00 + 5.00 + 5.00;
        System.out.println("Before Tax:" + " " + "$" + String.format("%.2f", BeforeTax));
        AfterTax = 2 * BeforeTax;
        System.out.println("After Tax:" + " " + "$" + String.format("%.2f", AfterTax));  
    }
}
