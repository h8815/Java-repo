// Step 1: Create your own exception class
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Use it in main program
public class TestAge {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote!");
        } else {
            System.out.println("You can vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(18);  // Test with invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
