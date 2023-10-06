public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
//   since a value divided by 0 is an arithmetic exception we can handle it by using the try catch statement without changing the values
        try {
            int result = divide(10, 0);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
