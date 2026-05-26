import java.util.Arrays;

public class NonPerfectSquaredNumbers {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 10, 49, 6};
        
        int[] result = replaceNonPerfectSquares(numbers);
        
        System.out.println("New Array: " + Arrays.toString(result));
    
    }
    
    
    public static int[] replaceNonPerfectSquares(int[] array) {
        int[] result = new int[array.length];
        
        for (int index = 0; index < array.length; index++) {
            int sqrt = (int) Math.sqrt(array[index]);
            
            if (sqrt * sqrt == array[index]) {
                result[index] = array[index];
            } else {
                result[index] = -1;
            }
        }
        return result; 
    }
}
