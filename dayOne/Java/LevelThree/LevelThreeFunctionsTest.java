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
    
    

