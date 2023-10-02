import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of currency denominations
        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();

        // Input the currency denominations in random order
        int[] denominations = new int[size];
        System.out.print("Enter the currency denominations values: ");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Sort the currency denominations in descending order
        Arrays.sort(denominations);
        for (int i = 0; i < size / 2; i++) {
            int temp = denominations[i];
            denominations[i] = denominations[size - i - 1];
            denominations[size - i - 1] = temp;
        }

        // Input the amount you want to pay
        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        // Calculate and print the minimum number of notes for each denomination
        for (int i = 0; i < size; i++) {
            int notes = amount / denominations[i];
            if (notes > 0) {
                System.out.println(denominations[i] + ":" + notes);
                amount = amount % denominations[i];
            }
        }

        scanner.close();
    }
}
