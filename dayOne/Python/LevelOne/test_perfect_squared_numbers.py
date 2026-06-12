from unittest import TestCase
import perfect_squared_numbers

class test_perfect_squared_numbers(TestCase):
    
    def test_perfect_squared_numbers(self):
        numbers = [4, 7, 9, 10, 16, 18];
        
        actual = perfect_squared_numbers.get_perfect_squared_numbers(numbers);
        
        expected = [4, 9, 16];
		
        self.assertEqual(expected, actual)
