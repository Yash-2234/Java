import java.util.Scanner;

public class Prime2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true; // 2 is the only even prime
        }
        if (n % 2 == 0) {
            return false; // No even number >2 can be prime
        }

        for (int i = 3; i * i <= n; i += 2) { // Check odd numbers only
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close(); // Close Scanner

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
