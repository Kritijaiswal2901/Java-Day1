import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int x = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter s number: ");
        int n = scanner.nextInt();
        if (n > 31) {
            System.out.println("value of number should be less than 31");
            return;
        } else {
            System.out.println(x);
            for (int j = 1; j <= n; j++) {
                x = x * 2;
                System.out.println(x);
            }
        }
    }
}
