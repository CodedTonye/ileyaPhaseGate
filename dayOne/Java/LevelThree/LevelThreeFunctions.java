import java.util.Arrays;

public class LevelThreeFunctions {

    public static void main(String[] args) {
    
        int[][] numbers = {
		    {9, 0, 7},
		    {3, 5, 1},
		    {8, 1, 7},
		    {9, 9, 6}
		};
		
        int[] newArray =  flattenArray(numbers);
        
        System.out.println("Given Array: " + Arrays.deepToString(numbers));        
        System.out.println("New Array: " + Arrays.toString(newArray));  
        
        
        System.out.println(); 
        
        
        int[] array = {1, -9, 3, 0, 8};                

        System.out.println("Given Array : " + Arrays.toString(array));

        System.out.println("k = 2  : " + Arrays.toString(rotateArray(array, 2))); 
        System.out.println("k = 5  : " + Arrays.toString(rotateArray(array, 5))); 
        System.out.println("k = 0  : " + Arrays.toString(rotateArray(array, 1))); 
    
    }
    
    
    public static int[] flattenArray(int[][] array) {
    
        int arraySize = 0;
        
        for (int innerArray = 0; innerArray < array.length; innerArray++) {
            for (int element = 0; element < array[innerArray].length; element++) {
                arraySize++;
            }
            
        }
        
        int[] newArray = new int[arraySize];
        int newArrayIndex = 0;
        
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                newArray[newArrayIndex] = array[row][column];
                newArrayIndex++;
            }
            
        }
               
        return newArray;
    }
    

    public static int[] rotateArray(int[] array, int k) {
    
        int length = array.length;
        
        k = k % length;
        
        int result[] = new int[length];
        
        for (int index = 0; index < length; index++) {
            int newPosition = (index + k) % length;
            result[newPosition] = array[index];
            
        }
               
        return result;
    } 
}


