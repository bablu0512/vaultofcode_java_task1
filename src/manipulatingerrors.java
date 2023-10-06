public class manipulatingerrors {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//            for (int i = 0; i <= numbers.length; i++) {  {incorrect loop condition because it causes arrayindexoutofboundexception so we should use i<numbers.length}
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
