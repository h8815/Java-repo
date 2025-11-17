import java.util.Scanner;

public class Print_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize counters for prime and non-prime numbers
        int primeCount = 0;
        int nonPrimeCount = 0;

        System.out.println("Enter 10 numbers :-");
        int[] number = new int[10];
        
        // Accepting 10 numbers from the user
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter " + (i + 1) + " number :");
            number[i] = scanner.nextInt();
        }

        // Loop to check each number whether it's prime or non-prime
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            boolean isPrime = true; // Assume the number is prime

            if (num <= 1) {
                isPrime = false; // Numbers less than or equal to 1 are not prime
            } else {
                // Check if the number is divisible by any number from 2 to sqrt(num)
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false; // If divisible, it is not a prime number
                        break;
                    }
                }
            }

            // Increment the respective counter based on whether the number is prime
            if (isPrime) {
                primeCount++;
            } else {
                nonPrimeCount++;
            }
        }

        // Output the results
        System.out.println("Prime numbers count: " + primeCount);
        System.out.println("Non-prime numbers count: " + nonPrimeCount);

        scanner.close();
    }
}
