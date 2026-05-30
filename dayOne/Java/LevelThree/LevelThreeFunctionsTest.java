import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LevelThreeFunctionsTest {

    @Test
	public void testThat2DArrayIsFlattenedCorrectly(){
		int[][] numbers = {
		    {9, 0, 7},
		    {3, 5, 1},
		    {8, 1, 7},
		    {9, 9, 6}
		};
		
		int[] actual = LevelThreeFunctions.flattenArray(numbers);

		int[] expected = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
		assertArrayEquals(expected, actual);
	}
    
    
     @Test
	public void testThatRotationOfArrayByGivenPositionsIsCorrect(){
		int[]array = {1, -9, 3, 0, 8};
		int k = 2;
		
		int[] actual = LevelThreeFunctions.rotateArray(array, k);

		int[] expected = {0, 8, 1, -9, 3};
		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void testThatTwoArraysAreMergedInOneArrayCorrectly(){
		int[] arrayOne = {3, 5, 1};   
        int[] arrayTwo = {2, 4, 6};   
		
		int[] actual = LevelThreeFunctions.mergeSortedArray(arrayOne, arrayTwo);

		int[] mergedArray = {1, 2, 3, 4, 5, 6};
		assertArrayEquals(mergedArray, actual);
	}
}
