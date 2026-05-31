import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordCipherTest {

    @Test
	public void testThatPasswordEncryptionWorks(){
		String text = "Caeser";
		
		String actual = PasswordCipher.encrypt(text);

		String expected = "Fdhvhu";
		assertEquals(expected, actual);
	}
	
	 @Test
	public void testThatPasswordDecryptionWorks(){
		String text = "Fdhvhu";
		
		String actual = PasswordCipher.decrypt(text);

		String expected = "Caeser";
		assertEquals(expected, actual);
	}
}
