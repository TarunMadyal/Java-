public class Main {
    public static int factorial(int n) {
        if (n == 1) {  // Base case
            return 1;
        }
        return n * factorial(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
