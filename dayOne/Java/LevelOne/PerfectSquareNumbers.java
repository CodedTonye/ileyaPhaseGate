import java.util.Arrays;

public class PerfectSquareNumbers {

    public static void main(String[] args) {
    
        int[] numbers = {4, 7, 9, 10, 16, 18};
        
        int[] newArray =  getPerfectSquaredNumbers(numbers);
        
        System.out.println(Arrays.toString(newArray));    
    }
    
    public static int[] getPerfectSquaredNumbers(int[] array) {
        int sizeCount = 0;
        
        for (int index = 0; index < array.length; index++) {
            int number = array[index];
            if (number >= 0) {
                int root = (int) Math.sqrt(number);
                if (root * root == number) {
                    sizeCount++;
                }
            }
            
        }
        
        int[] perfectSquares = new int[sizeCount];
        int index = 0;
        
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            int number = array[arrayIndex];
            if (number >= 0) {
                int root = (int) Math.sqrt(number);
                if (root * root == number) {
                    perfectSquares[index] = number;
                    index++;
                }
            }
        }   
        return perfectSquares;
    }
}
