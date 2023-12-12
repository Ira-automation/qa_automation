package HomeWork;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in USD: ");
        double amountInUsd = scanner.nextDouble();

        double commission = 1.0;
        double exchangeRate = 36.55;

        CurrencyConvertor converter = new CurrencyConvertor(commission, exchangeRate);

        double totalAmount = converter.calculateTotalAmount(amountInUsd);

        System.out.println("Total amount to be paid: " + totalAmount + " UAH");
    }
}
