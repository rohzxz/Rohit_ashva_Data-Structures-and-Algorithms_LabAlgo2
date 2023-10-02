import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the transaction array
        System.out.print("Enter the size of transaction array: ");
        int size = scanner.nextInt();

        // Input the values of the transaction array
        int[] transactionArray = new int[size];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < size; i++) {
            transactionArray[i] = scanner.nextInt();
        }

        // Input the total number of targets that need to be achieved
        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();

        // Input the targets and check if they are achieved
        for (int t = 1; t <= numTargets; t++) {
            System.out.print("Enter the value of target " + t + ": ");
            int target = scanner.nextInt();

            int sum = 0;
            int transactionsNeeded = 0;
            boolean targetAchieved = false;

            for (int i = 0; i < size; i++) {
                sum += transactionArray[i];
                transactionsNeeded++;

                if (sum >= target) {
                    targetAchieved = true;
                    break;
                }
            }

            if (targetAchieved) {
                System.out.println("Target " + t + " is achieved after " + transactionsNeeded + " transactions.");
            } else {
                System.out.println("Given target " + target + " is not achieved.");
            }
        }

        scanner.close();
    }
}
