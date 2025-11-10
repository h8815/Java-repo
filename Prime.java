import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int i = 2;
        while(i<number){
            if(number%i == 0){
                System.out.println(number + " is not a prime number");
                break;
            }
            i++;
        }
        if(number == i || number == 1 || number == 2){
            System.out.println(number + " is a prime number");
        }
    }
}
