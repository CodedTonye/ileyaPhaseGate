import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PerfectSquareNumbersTest {

    @Test
	public void testThatNumbersArePerfectlySquared(){
		int[] numbers = {4, 7, 9, 10, 16, 18};

		
		int[] actual = PerfectSquareNumbers.getPerfectSquaredNumbers(numbers);

		
		int[] expected = {4, 9, 16};
		assertArrayEquals(expected, actual);
	}
    
}
