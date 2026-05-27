import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LevelTwoFunctionsTest {

    @Test
	public void testThatValuesAppearMoreThanOnce(){
		int[] numbers = {1, 2, 3, 2, 4, 3};
		
		int[] actual = LevelTwoFunctions.getRepeatedValues(numbers);

		int[] expected = {2, 3};
		assertArrayEquals(expected, actual);
	}
    
    
    @Test
	public void testThatZeroesAreMovedToTheBack(){
		int[] numbers = {5, 0, 3, 0, 2, 0};
		
		int[] actual = LevelTwoFunctions.moveAllZeroes(numbers);

		int[] expected = {5, 3, 2, 0, 0, 0};
		assertArrayEquals(expected, actual);
	}
}
