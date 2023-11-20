import java.util.Random;
import java.util.Scanner;

public class FlipFlop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();
        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int heads = 0, tails = 0;
        Random random = new Random();
        for (int i = 0; i < numFlips; i++) {
            double randomValue = random.nextDouble();
            if (randomValue < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double headsPercentage = (double) heads / numFlips * 100;
        double tailsPercentage = (double) tails / numFlips * 100;
        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");
        scanner.close();
    }
}
