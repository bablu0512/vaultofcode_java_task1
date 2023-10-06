import java.util.HashMap;  // it is used to import hasmap which is used to store the computed data
public class Fibonacci {
    //   Creating a HashMap to store already computed Fibonacci values and executing in line
    private static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int fibonacci(int n) {
        if (n <= 1)
        {
            return n;
        }
        else
        {
//   Checking if the value for (n) is already computed and stored
            if (memo.containsKey(n))
            {
                return memo.get(n);
            }
            else
            {
//   If not computed, calculate it and store it in the HashMap
                int result = fibonacci(n - 1) + fibonacci(n - 2);
                memo.put(n, result);
                return result;
            }
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
