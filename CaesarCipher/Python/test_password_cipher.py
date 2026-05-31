from unittest import TestCase
import password_cipher

class test_password_cipher(TestCase): 
    
    def test_that_password_encryption_works(self):
        text = "Caeser"
        
        actual = password_cipher.encrypt(text)

        expected = "Fdhvhu"
		
        self.assertEqual(expected, actual)
        
        
    def test_that_password_decryption_works(self):
        text = "Fdhvhu"
        
        actual = password_cipher.decrypt(text)

        expected = "Caeser"
		
        self.assertEqual(expected, actual)
