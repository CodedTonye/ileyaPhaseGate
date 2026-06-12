import java.util.Arrays;

public class EvenAndOddArrays {

    public static void main(String[] args) {
        int[] numbers = {45, 60, 3, 10, 9, 22};
        
        int[][] result = splitArray(numbers);
        
        System.out.println("Even numbers: " + Arrays.toString(result[0]));
        System.out.println("Odd numbers: " + Arrays.toString(result[1]));
        
    
    }
    
    
    public static int[][] splitArray(int[] arrays) {
        int evenCount = 0;
        int oddCount = 0;
        
        for (int index = 0; index < arrays.length; index++) {
            if (arrays[index] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
            
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
            
        int evenIndex = 0;
        int oddIndex = 0;
            
        for (int index = 0; index < arrays.length; index++) {
            if (arrays[index] % 2 == 0) {
                evenArray[evenIndex++] = arrays[index];
            } else {
                oddArray[oddIndex++] = arrays[index];
            } 
            
            
        }
        return new int[][]{evenArray, oddArray};
    }
    
}

