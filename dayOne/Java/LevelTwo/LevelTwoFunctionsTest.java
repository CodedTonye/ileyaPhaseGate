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
    
}
