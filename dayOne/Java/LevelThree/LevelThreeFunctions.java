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
        
        
        System.out.println();
        
        
        int[] arrayOne = {3, 5, 1};   
        int[] arrayTwo = {2, 4, 6};   
        
        int[] mergedArray = mergeSortedArray(arrayOne, arrayTwo);           

        System.out.println("Array 1: " + Arrays.toString(arrayOne)); 
        System.out.println("Array 2: " + Arrays.toString(arrayTwo)); 
        System.out.println("Merged Array: " + Arrays.toString(mergedArray)); 
    
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




    public static int[] mergeSortedArray(int[] arrayOne, int[] arrayTwo) {
    
        int[] newArray = new int[arrayOne.length + arrayTwo.length];
              
        for (int firstArrayIndex = 0; firstArrayIndex < arrayOne.length; firstArrayIndex++) {
            newArray[firstArrayIndex] = arrayOne[firstArrayIndex]; 
        }
        for (int secondArrayIndex = 0; secondArrayIndex < arrayTwo.length; secondArrayIndex++) {
            newArray[arrayOne.length + secondArrayIndex] = arrayTwo[secondArrayIndex]; 
        }
        
        for (int index = 0; index < newArray.length - 1; index++) {
            for (int element = 0; element < newArray.length - 1 - index; element++) {
                
                if (newArray[element] > newArray[element + 1]) {
                
                    int temp = newArray[element];
                    newArray[element] = newArray[element + 1];
                    newArray[element + 1] = temp;
                }
            }   
        }         
        return newArray;
    }
}
























