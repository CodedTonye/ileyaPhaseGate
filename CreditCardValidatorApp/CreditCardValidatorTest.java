import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {

    @Test
    public void testConvertionOfNumberToArray() {

        long input = 438857;

        int[] expected = {4, 3, 8, 8, 5, 7};

        int[] actual = CreditCardValidator.convertNumberToArray(input);

        assertArrayEquals(expected, actual);
    }


    @Test
    public void testVisaCardType() {

        long input = 4388576018410707L;

        String expected = "Visa Card";

        int[] array = CreditCardValidator.convertNumberToArray(input);

        String actual = CreditCardValidator.getCardType(array);

        assertEquals(expected, actual);
    }
    

    @Test
    public void testMasterCardType() {

        long input = 5388576018410707L;

        String expected = "MasterCard";

        int[] array = CreditCardValidator.convertNumberToArray(input);

        String actual = CreditCardValidator.getCardType(array);

        assertEquals(expected, actual);
    }


    @Test
    public void testDiscoverCardType() {

        long input = 6388576018410707L;

        String expected = "Discover Card";

        int[] array = CreditCardValidator.convertNumberToArray(input);

        String actual = CreditCardValidator.getCardType(array);

        assertEquals(expected, actual);
    }


    @Test
    public void testAmericanExpressCardType() {

        long input = 378571234567890L;

        String expected = "American Express Card";

        int[] array = CreditCardValidator.convertNumberToArray(input);

        String actual = CreditCardValidator.getCardType(array);

        assertEquals(expected, actual);
    }
    

    @Test
    public void testUnknownCardType() {
    
        long input = 2388576018410707L;

        String expected = "Unknown Card";
    
        int[] array = CreditCardValidator.convertNumberToArray(input);

        String actual = CreditCardValidator.getCardType(array);

        assertEquals(expected, actual);
    }
    
    
    @Test
    public void testValidCard() {
    
        int[] input = CreditCardValidator.convertNumberToArray(4388576018410707L);
        
        assertEquals("Valid", CreditCardValidator.isValidCard(input));
    }


    @Test
    public void testInvalidCard() {
    
        int[] input = CreditCardValidator.convertNumberToArray(4388576018402626L);
        
        assertEquals("Invalid", CreditCardValidator.isValidCard(input));
    }

}
