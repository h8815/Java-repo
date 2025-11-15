// Base class: Factorial calculation
class Factorial {
    int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Derived class: Prime checking (inherits Factorial)
class Prime extends Factorial {
    boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// Derived class: Fibonacci sequence (inherits Prime)
class Fibonacci extends Prime {
    void printFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();

        // Predefined numbers
        int factorialNum = 5;
        int primeNum = 11;
        int fibonacciTerms = 7;

        // Factorial calculation
        System.out.println("Factorial of " + factorialNum + " is: " + obj.calculateFactorial(factorialNum));

        // Prime checking
        if (obj.isPrime(primeNum)) {
            System.out.println(primeNum + " is a prime number.");
        } else {
            System.out.println(primeNum + " is not a prime number.");
        }

        // Fibonacci series
        obj.printFibonacci(fibonacciTerms);
    }
}
