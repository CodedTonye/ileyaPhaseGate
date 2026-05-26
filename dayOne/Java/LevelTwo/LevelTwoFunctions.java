import java.util.Arrays;

public class LevelTwoFunctions {

    public static void main(String[] args) {
    
        int[] numbers = {1, 2, 3, 2, 4, 3};
        
        int[] newArray =  getRepeatedValues(numbers);
        
        System.out.println(Arrays.toString(numbers));        
        System.out.println(Arrays.toString(newArray));  
    
    }
    
    
    public static int[] getRepeatedValues(int[] array) {
    
        int sizeCount = 0;
        
        for (int index = 0; index < array.length; index++) {
            for (int indexCheck = index + 1; indexCheck < array.length; indexCheck++) {
                if (array[index] == array[indexCheck]) {
                    sizeCount++;
                }
            }
            
        }
        
        int[] repeatedValues = new int[sizeCount];
        int index = 0;
        
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            for (int indexCheck = arrayIndex + 1; indexCheck < array.length; indexCheck++) {
                if (array[arrayIndex] == array[indexCheck]) {
                    repeatedValues[index] = array[arrayIndex];
                    index++;
                }
            }
        }   
        return repeatedValues;
    }
    
}
