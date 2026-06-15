

public class fibonacciNumber509 {

    public static int fibonacci(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }   
    
}
