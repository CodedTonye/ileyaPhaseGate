from unittest import TestCase
import palindrome_list

class test_palindrome_list(TestCase):
    
    def test_that_list_is_palindrome(self):
        numbers = [45, 0, 8, 0, 45]
        
        actual = palindrome_list.is_palindrome(numbers)
        
        self.assertTrue(actual)
