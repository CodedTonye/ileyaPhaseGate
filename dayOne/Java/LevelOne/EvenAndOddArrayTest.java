import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class EvenAndOddArrayTest {

    @Test
	public void testThatEvenAndOddArraysAreCorrect(){
		int[] numbers = {45, 60, 3, 10, 9, 22};

		
		int[][] actual = EvenAndOddArrays.splitArray(numbers);

		
		int[][] expected = {{60, 10, 22}, {45, 3, 9}};
		assertArrayEquals(expected, actual);
	}
    
}
