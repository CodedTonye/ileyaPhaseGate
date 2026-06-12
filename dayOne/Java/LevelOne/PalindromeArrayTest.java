import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PalindromeArrayTest {

    @Test
	public void testThatArrayIsPalindrome(){
		int[] numbers = {45, 0, 8, 0, 45};

		boolean actual = PalindromeArray.isPalindrome(numbers);
		
		assertTrue(actual);
	}
    
}
