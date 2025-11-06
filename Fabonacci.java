class printFabonacci{
    void  fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
public class Fabonacci{
    public static void main(String[] args) {
        printFabonacci p1 = new printFabonacci();
        p1.fibonacciIterative(5);
    }
}