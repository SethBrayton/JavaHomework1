import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in EUR: ");
        double euros = sc.nextDouble();
        sc.close();

        final double CONVERSION_RATE = 1.23;
        double dollars = euros * CONVERSION_RATE;

        System.out.println(euros + " EUR = " + dollars + " US dollars");
    }
}