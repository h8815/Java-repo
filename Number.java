
import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers :-");
        int number[] = new int[10];
        for(int i=0 ; i<number.length ; i++){
            System.out.println("Enter "+(i+1)+" number :");
            number[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0 ; i<number.length ; i++){
            sum = sum + number[i];
        }
        int max = number[0];
        // System.out.println(max);
        int min = number[0];
        for(int i=0 ; i<number.length ; i++){
            if(number[i] > max){
                max = number[i];
            }
            if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println("Maximum number : "+max+"\nMinimum number : "+min);
        System.out.println("Sum of all numbers : "+sum);
    }
}
