import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class NonPerfectSquaredNumbersTest {

    @Test
	public void testThatNonPerfectSquaredNumbersAreReplacedWith(){
		int[] numbers = {4, 7, 9, 10, 49, 6};

		
		int[] actual = NonPerfectSquaredNumbers.replaceNonPerfectSquares(numbers);

		
		int[] expected = {4, -1, 9, -1, 49, -1};
		assertArrayEquals(expected, actual);
	}
    
}
